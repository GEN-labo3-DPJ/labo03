/**
 * @name: Die.java
 * @work: GEN-labo3
 * @authors: David Dupraz, Julien Brunisholz, Pablo Mercado
 * @date: 22.04.2020
 */
package ch.heigvd.gen.monopoly;

import java.util.Random;

/**
 * @brief un de
 */
public class Dice
{
    // calculating a random number total between 2 and 12 (the range of two dice)
    public static final int LOWER_RANGE = 1;
    public static final int UPPER_RANGE = 6;
    private static final Random RANDOM = new Random();

    // By LRG, we'll create a Die object with a faceValue attribute
    private int faceValue;

    /**
     * @brief Calculating a new random faceValue involves changing information in the Die, so by Expert Die
     * should be able to “roll” itself (generate a new random value, using domain vocabulary),
     * and answer its faceValue
     */
    public void roll(){
        this.faceValue = LOWER_RANGE + RANDOM.nextInt(UPPER_RANGE - LOWER_RANGE + 1);
    }

    /**
     * @brief accesseur
     * @return la resultat du lancer
     */
    public int getFaceValue() {
        return this.faceValue;
    }
}
