package com.nishan;

public class PC {
    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void powerUp()
    {
        theCase.pressPowerButton();
        monitor.drawPixelAt(12,15,"red");
        motherboard.programLoad("News");
    }


    private Case getThecase() {
        return theCase;
    }

    public int monitorResultionWidth()
    {
        return monitor.getNativeReolution().getWidth();
    }

    public Monitor getMonitor() {
        return monitor;
    }
//
//    public Motherboard getMotherboard() {
//        return motherboard;
//    }
}
