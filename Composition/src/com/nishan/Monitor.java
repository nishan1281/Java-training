package com.nishan;

public class Monitor {

    private String model;
    private String manufacturer;
    private int size;
    private Resolution nativeReolution;

    public Monitor(String model, String manufacturer, int size, Resolution nativeReolution) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.size = size;
        this.nativeReolution = nativeReolution;
    }

    public void drawPixelAt (int x, int y, String color)
    {
        System.out.println(this.model + " Drawing pixel at " + x + "," + y + " of color " + color);
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getSize() {
        return size;
    }

    public Resolution getNativeReolution() {
        return nativeReolution;
    }
}
