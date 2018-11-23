package com.nishan;

public class Song {
    private String title;
    private double duration;

    public Song (String title, double duration)
    {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle()
    {
        return title;
    }

    public double getDuration()
    {
        return duration;
    }

    @Override
    public String toString()
    {
        return this.title + ": " + this.duration;   // this Override toString method will return an output if an new object is created and print by the new object name.
                                                    // like it is written Song S1 = new Song("valotheko", 10; sout(S1); here S1 will give the desired out put.
    }
}
