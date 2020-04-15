/**
 * @name: Board.java
 * @work: GEN-labo3
 * @authors: David Dupraz, Julien Brunisholz, Pablo Mercado
 * @date: 22.04.2020
 */
package ch.heigvd.gen.monopoly;

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
     * @param dieTotal le resultat du lance de des
     * @return la nouvelle case
     */
    public Square getSquare(Square oldLocation, int dieTotal){
        assert dieTotal >= Dice.LOWER_RANGE && dieTotal <= Dice.UPPER_RANGE;
        for(int i = 0; i < TOTAL_SQUARES; i++){
            if(squares[i] == oldLocation) {
                return squares[(i + dieTotal) % squares.length];
            }
        }

        return null;
    }
}
