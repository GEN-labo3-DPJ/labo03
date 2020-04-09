package ch.heigvd.gen.monopoly;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DieTest {
    private static final int NUMBER_OF_TESTS = 100;
    private Die die;

    @BeforeEach
    public void beforeEach() {
        System.out.println("@BeforeEach: beforeEach");
        this.die = new Die();
    }

    @Test
    public void rollShouldBeBetween1And6(){
        for(int i = 0; i < NUMBER_OF_TESTS; i++){
            die.roll();
            int r = die.getFaceValue();
            assertAll("Die should be in range",
                    () -> assertTrue(Die.LOWER_RANGE <= r),
                    () -> assertTrue(r <= Die.UPPER_RANGE));
        }
    }

    @Test
    public void allValueAreReached(){
        boolean[] valueReached = new boolean[Die.UPPER_RANGE];
        boolean[] expectedValueReached = new boolean[Die.UPPER_RANGE];
        for(int i = 0; i < expectedValueReached.length; i++){
            expectedValueReached[i] = true;
        }

        for(int i = 0; i < NUMBER_OF_TESTS; i++){
            die.roll();
            valueReached[die.getFaceValue() - 1] = true;
        }
        assertArrayEquals(valueReached, expectedValueReached);
    }
}