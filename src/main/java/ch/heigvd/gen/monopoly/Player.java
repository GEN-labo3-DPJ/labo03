/**
 * @name: Player.java
 * @work: GEN-labo3
 * @authors: David Dupraz, Julien Brunisholz, Pablo Mercado
 * @date: 22.04.2020
 */
package ch.heigvd.gen.monopoly;

import ch.heigvd.gen.monopoly.squares.Square;

/**
 * @brief le joueur
 */
public class Player {
    private Board board;
    private DiceCup diceCup;
    private Square location;
    private int cash;

    public int getCash()
    {
        return cash;
    }

    /**
     * Taking a turn means:
     * 1. calculating a random number total between 2 and 12 (the range of two dice)
     * 2. calculating the new square location
     * 3. moving the player's piece from an old location to a new square location
     */
    public void takeTurn(){
        diceCup.roll();
        int fvTotal =diceCup.getTotal();
        Square newLocation = board.getSquare(location, fvTotal);
        setLocation(newLocation);
        newLocation.landedOn(this);
    }

    public void setLocation(Square nL)
    {
        location=nL;
    }

    public void addCash(int amount)
    {
        cash+=amount;
    }
}
