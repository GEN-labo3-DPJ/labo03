/**
 * @name: Square.java
 * @work: GEN-labo3
 * @authors: David Dupraz, Julien Brunisholz, Pablo Mercado
 * @date: 22.04.2020
 */
package ch.heigvd.gen.monopoly.squares;

import ch.heigvd.gen.monopoly.Player;

/**
 * @brief la case d'un plateau de jeu
 */
public abstract class Square
{
    private String name;

    public abstract void landedOn(Player p);
}
