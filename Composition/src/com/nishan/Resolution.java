package com.nishan;

public class Resolution {

    private int width;
    private int hight;

    public Resolution(int width, int hight) {

        if (width>0 || width==-2){   // this is encapsulation
            this.width = width;
        }
        else this.width = 10;

        this.hight = hight;
    }

    public int getWidth() {
        return width;
    }

    public int getHight() {
        return hight;
    }
}
