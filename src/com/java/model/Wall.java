package com.java.model;

import com.java.model.enumss.Direction;

public class Wall {
    // private String direction;
    private Direction direction;

    public Wall(Direction direction) {
        this.direction = direction;
    }

    public Direction getDirection() {return direction;}
    public void create(){
        System.out.println("Direction object:" + direction.name());
    }

    @Override
    public String toString() {
        return "Wall{" +
                "direction=" + direction +
                '}';
    }
}
