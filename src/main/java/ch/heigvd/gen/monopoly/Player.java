/**
 * @name: Player.java
 * @work: GEN-labo3
 * @authors: David Dupraz, Julien Brunisholz, Pablo Mercado
 * @date: 22.04.2020
 */
package ch.heigvd.gen.monopoly;

/**
 * @brief le joueur
 */
public class Player {
    private Board board;
    private Piece piece;
    private Die die1;
    private Die die2;

    /**
     * Taking a turn means:
     * 1. calculating a random number total between 2 and 12 (the range of two dice)
     * 2. calculating the new square location
     * 3. moving the player's piece from an old location to a new square location
     */
    public void takeTurn(){
        die1.roll(); die2.roll();
        int fvTotal = die1.getFaceValue() + die2.getFaceValue();
        Square oldLocation = piece.getLocation();
        Square newLocation = board.getSquare(oldLocation, fvTotal);
        piece.setLocation(newLocation);
    }
}
