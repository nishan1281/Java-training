package com.nishan;

public class Main
{

    public static void main(String[] args)
    {
       calcFeetAndInchToCentimeters(1,11);
        calcFeetAndInchToCentimeters(-121);
    }

    public static double calcFeetAndInchToCentimeters (double feet, double inch)
    {
        if ((feet<0)|| (inch<0) || (inch>12))
        {
            System.out.println("Invalid Data input");
            return -1;
        }

        double centimeter = feet*12;
        centimeter+=inch*2.54;
        System.out.println(feet + " Feet " + inch + " Inch equal to : " + centimeter+" cm" );
        return centimeter;
    }

    public static double calcFeetAndInchToCentimeters (double inch)
    {
        if (inch <0 )
        {
            System.out.println("invalid");
            return -1;
        }

        double feet = (int)inch/12;
        double remainder = inch%12;
        System.out.println(feet+ " feet " +(int)remainder + " inch");
        return calcFeetAndInchToCentimeters(feet,remainder);
    }

}
