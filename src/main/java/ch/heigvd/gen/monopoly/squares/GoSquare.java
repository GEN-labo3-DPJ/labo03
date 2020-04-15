package ch.heigvd.gen.monopoly.squares;

import ch.heigvd.gen.monopoly.Player;

public class GoSquare extends Square
{
    @Override
    public void landedOn(Player p)
    {
        p.addCash(200);
    }
}
