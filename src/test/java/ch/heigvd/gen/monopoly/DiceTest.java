package ch.heigvd.gen.monopoly;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiceTest
{
    private static final int NUMBER_OF_TESTS = 100;
    private Dice dice;

    @BeforeEach
    public void beforeEach() {
        System.out.println("@BeforeEach: beforeEach");
        this.dice = new Dice();
    }

    @Test
    public void rollShouldBeBetween1And6(){
        for(int i = 0; i < NUMBER_OF_TESTS; i++){
            dice.roll();
            int r = dice.getFaceValue();
            assertAll("Die should be in range",
                    () -> assertTrue(Dice.LOWER_RANGE <= r),
                    () -> assertTrue(r <= Dice.UPPER_RANGE));
        }
    }

    @Test
    public void allValueAreReached(){
        boolean[] valueReached = new boolean[Dice.UPPER_RANGE];
        boolean[] expectedValueReached = new boolean[Dice.UPPER_RANGE];
        for(int i = 0; i < expectedValueReached.length; i++){
            expectedValueReached[i] = true;
        }

        for(int i = 0; i < NUMBER_OF_TESTS; i++){
            dice.roll();
            valueReached[dice.getFaceValue() - 1] = true;
        }
        assertArrayEquals(valueReached, expectedValueReached);
    }
}