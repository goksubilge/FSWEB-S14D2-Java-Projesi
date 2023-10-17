package com.java.model;

import com.java.model.enumss.LampType;
public class Lamp {
    private LampType style;
    private boolean battery;
    private int globRating;

    public Lamp(LampType style, boolean battery, int globRating) {
        this.style = style;
        this.battery = battery;
        this.globRating = globRating;
    }

    public LampType getStyle()  {
        return style;
    }
    public boolean isBattery() {
        return battery;
    }
    public int getGlobRating() {
        return globRating;
    }
    public void turnOn() {
    System.out.println( "Lamp is being turned on.");
}
@Override  // bugünün tekrarı: BUILDER
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("\n****\n");
        builder.append("LAMP\n");
    builder.append("Style: " + style + "\n");
    builder.append("Battery: " + battery + "\n");
    builder.append("Glob Raiting: " + globRating + "\n");
    return builder.toString();
}
}