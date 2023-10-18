package com.java.model.enumss;

public enum PaintColor {
    PINK(0),
    YELLOW(1),
    ORANGE(2),
    BLACK(3),
    WHİTE(4),
    BEIGE(5),
    PURPLE(6),
    RED(7),
    GREEN(8);

    private int colorCode ;
    PaintColor (int colorCode) {
        this.colorCode = colorCode;
    }
}
