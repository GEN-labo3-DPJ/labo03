package ch.heigvd.gen.monopoly;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

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

    @ParameterizedTest
    @ValueSource(ints = {2, 3, 45})
    void isDiceCupCreatedAlwaysDifferentObject(int numberOfCups) {
        DiceCup dcs[] = new DiceCup[numberOfCups];
        for (int i = 0; i < numberOfCups; i++) {
            dcs[i] = new DiceCup();
        }

        for (int i = 0; i < numberOfCups; i++) {
            for (int j = 0; j < numberOfCups; j++) {
                if(i != j)
                    assertNotSame(dcs[i], dcs[j]);
            }
        }

    }

    @Test
    void isDiceCupCreatedAlwaysDifferentObject(){
        DiceCup dc1 = new DiceCup();
        DiceCup dc2 = new DiceCup();
        assertNotSame(dc1, dc2);
    }

    @Test
    void isDiceCupCreatedNotNull(){
        DiceCup dc = new DiceCup();
        assertNotNull(dc);
    }

    @RepeatedTest(NUMBER_OF_TESTS)
    void isCupTotalAlwaysBetween1And12(TestInfo testInfo) {
        DiceCup dc = new DiceCup();
        dc.roll();
        assertTrue(dc.getTotal() <= 12 && dc.getTotal() > 0);
    }
}