package ch.heigvd.gen.monopoly.squares;

import ch.heigvd.gen.monopoly.Player;

public class IncomeTaxSquare extends Square
{
    @Override
    public void landedOn(Player p)
    {
        p.addCash(-(int)(p.getCash()*0.9));
    }
}
