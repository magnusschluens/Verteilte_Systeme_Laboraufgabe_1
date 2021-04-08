package Classes;

import java.util.Scanner;

public class Program
{

    static void main(String[] args)
    {
        int i = howManyDices();
        createDices(i);

    }

    private static void createDices(int i)
    {
        for (int a = 1; a < i+1; a++)
        {
            Dice dice = new Dice("Wuerfel " + a);
            String name = dice.getName();
            System.out.println(name);
        }
    }

    private static int howManyDices()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Wie viele Würfel soll es geben? ");
        int i = input.nextInt();
        System.out.println("Es wird mit " + i + " Würfeln gespielt");
        return i;
    }
}
