package com.java.model;

import com.java.model.enumss.Direction;

import java.util.Arrays;

public class Room {
    private String name;
    private Wall[] walls;
    private Lamp lamp;
    private Ceiling ceiling;

    public String getName() {return name;}
    public Wall[] getWalls() {return walls;}
    public Lamp getLamp() {return lamp;}
    public Ceiling getCeiling() {return ceiling;}


    public Room(String name, Lamp lamp, Ceiling ceiling) {
        this.name = name;
        this.walls = new Wall[] {new Wall(Direction.NORTH),new Wall(Direction.EAST),new Wall(Direction.SOUTH),new Wall(Direction.WEST)};
        this.lamp = lamp;
        this.ceiling = ceiling;
    }

    @Override
    public String toString() {
        return "Room{" +
                "name='" + name + '\'' +
                ", walls=" + Arrays.toString(walls) +
                ", lamp=" + lamp +
                ", ceiling=" + ceiling +
                '}';
    }
}
