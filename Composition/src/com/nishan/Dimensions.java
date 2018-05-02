package com.nishan;

public class Dimensions {

    private int width;
    private int hight;
    private int depth;

    public Dimensions(int width, int hight, int depth) {
        if (width>0)
        {this.width = width;}
        else this.width = 10;
        this.hight = hight;
        this.depth = depth;
    }

    public int getWidth() {
        return width;
    }

    public int getHight() {
        return hight;
    }

    public int getDepth() {
        return depth;
    }
}
