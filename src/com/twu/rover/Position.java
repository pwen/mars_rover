package com.twu.rover;

public class Position {

    private int x;
    private int y;

    private int mapX;
    private int mapY;

    public Position(int x, int y, int mapX, int mapY) {
        this.x = x;
        this.y = y;
        this.mapX = mapX;
        this.mapY = mapY;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void incrementY() {
        if (y+1 <= mapY) y++;
    }

    public void incrementX() {
        if (x+1 <= mapX) x++;
    }

    public void decrementY() {
        if (y-1 >= 0) y--;
    }

    public void decrementX() {
        if (x-1 >= 0) x--;
    }

}