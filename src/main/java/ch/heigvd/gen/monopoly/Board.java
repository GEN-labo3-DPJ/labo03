/**
 * @name: Board.java
 * @work: GEN-labo3
 * @authors: David Dupraz, Julien Brunisholz, Pablo Mercado
 * @date: 22.04.2020
 */
package ch.heigvd.gen.monopoly;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @brief le plateau de jeu
 */
public class Board {
    // a Board knows all its Squares
    private Square squares[];

    /**
     * @brief a Board will be responsible for knowing a new square location,
     * given an old square location, and some offset (the dice total)
     * @param index location de l'ancienne case
     * @param dieTotal le resultat du lance de des
     * @return la nouvelle case
     */
    public Square getNextSquare(int index, int dieTotal){
        assert dieTotal >= Die.LOWER_RANGE && dieTotal <= Die.UPPER_RANGE;
        return squares[(index + dieTotal) % squares.length];
    }
}
