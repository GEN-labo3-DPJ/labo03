package ch.heigvd.gen.monopoly;

public class DiceCup
{
    private Dice[] dices;
    private short total;

    DiceCup()
    {
        dices=new Dice[2];
        dices[0] = new Dice();
        dices[1] = new Dice();
    }

    public short getTotal()
    {
        return total;
    }

    public void roll()
    {
        total=0;
        for(short x=0;x<dices.length;++x)
        {
            dices[x].roll();
            total+=dices[x].getFaceValue();
        }
    }
}
