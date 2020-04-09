/**
 * @name: Piece.java
 * @work: GEN-labo3
 * @authors: David Dupraz, Julien Brunisholz, Pablo Mercado
 * @date: 22.04.2020
 */
package ch.heigvd.gen.monopoly;

/**
 * @brief la piece
 */
public class Piece {
    private Square location;

    /**
     * @brief accesseur
     * @return la case sur laquelle se trouve la piece
     */
    public Square getLocation() { return this.location; }

    /**
     * @brief mutateur
     * @param newLocation la nouvelle case ou se trouve la piece
     */
    public void setLocation(Square newLocation) { this.location = newLocation; }
}
