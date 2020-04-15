/**
 * @name: Board.java
 * @work: GEN-labo3
 * @authors: David Dupraz, Julien Brunisholz, Pablo Mercado
 * @date: 22.04.2020
 */
package ch.heigvd.gen.monopoly;

import ch.heigvd.gen.monopoly.squares.Square;

/**
 * @brief le plateau de jeu
 */
public class Board {
    // a Board knows all its Squares
    private static int TOTAL_SQUARES = 40;
    private Square squares[] = new Square[TOTAL_SQUARES];

    /**
     * @brief a Board will be responsible for knowing a new square location,
     * given an old square location, and some offset (the dice total)
     * @param oldLocation location de l'ancienne case
     * @param diceTotal le resultat du lance de des
     * @return la nouvelle case
     */
    public Square getSquare(Square oldLocation, int diceTotal){
        assert diceTotal >= Dice.LOWER_RANGE && diceTotal <= Dice.UPPER_RANGE;
        for(int i = 0; i < TOTAL_SQUARES; i++){
            if(squares[i] == oldLocation) {
                return squares[(i + diceTotal) % squares.length];
            }
        }

        return null;
    }
}
