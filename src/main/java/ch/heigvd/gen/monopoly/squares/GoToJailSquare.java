package ch.heigvd.gen.monopoly.squares;

import ch.heigvd.gen.monopoly.Board;
import ch.heigvd.gen.monopoly.Player;

public class GoToJailSquare extends Square
{
    private Square jail;

    @Override
    public void landedOn(Player p)
    {
        p.setLocation(jail);
    }
}
