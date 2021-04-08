package Classes;

public class Dice
{
    //fields
    private String _name = null;

    //properties
    public String getName()
    {
        return _name;
    }
    public void setName(String newName)
    {
        _name = newName;
    }

    public Dice (String name)
    {
        _name = name;
    }


    private int wuerfeln()
    {
        int ergebnis = (int)(Math.random() * 6 + 1);
        System.out.println(ergebnis);
        return ergebnis;
    }

}
