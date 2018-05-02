package com.nishan;

public class OutLander extends Car {

    private int roadServiceMonth;

    public OutLander (int roadServiceMonth)
    {
        super("Outlander", "10", 5, 4, 6, false);
        this.roadServiceMonth = roadServiceMonth;
    }

    public void accelerate (int rate)
    {
        int newVelocity = getCurrentVelocity() + rate;

        if(newVelocity==0)
        {stop();
        changeGeers(1);
        }
        else if (newVelocity >0 && newVelocity <=10)
        { changeGeers(1);}
        else if (newVelocity >10 && newVelocity <=20)
        { changeGeers(1);}
        else if (newVelocity >20 && newVelocity <=30)
        { changeGeers(3);}
        else
        { changeGeers(4);}

        if (newVelocity >0)
        {changeVelocity(newVelocity, getCurrentDirection());}


    }


}
