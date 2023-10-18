package com.java.model;

public class Bed {
    private String style;
    private int height;
    private int pillows;
    private int sheets;
    private int quilts;

    public Bed(String style, int pillows, int height, int sheets, int quilts) {
        this.style = style;
        this.pillows = pillows;
        this.height = height;
        this.sheets = sheets;
        this.quilts = quilts;
    }

    public int getHeight() {return height;}
    public int getPillows() {return pillows;}
    public int getSheets() {return sheets;}
    public int getQuilts() {return quilts;}
    public void make(){System.out.println("The bed is being made.");}

    @Override // bugünün tekrarı: BUILDER
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("\n**** BED ****\n");
        builder.append("BED\n");
        builder.append("Style: " + style + "\n");
        builder.append("Height: " + height + "\n");
        builder.append("Pillows: " + pillows + "\n");
        builder.append("Sheets: " + sheets + "\n");
        builder.append("Quilts: " + quilts + "\n");
        return builder.toString();
    }
}
