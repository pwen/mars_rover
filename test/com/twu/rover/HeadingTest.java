package com.twu.rover;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class HeadingTest {

    private int mapX = 50;
    private int mapY = 50;

    @Test
    public void movedForwardNorthHeading() {
        Position pos = new Position(1, 1, mapX, mapY);
        Heading.NORTH.moveForward(pos);
        assertEquals(2, pos.getY());
        assertEquals(1, pos.getX());
    }

    @Test
    public void movedForwardEastHeading() {
        Position pos = new Position(10, 10, mapX, mapY);
        Heading.EAST.moveForward(pos);
        assertEquals(10, pos.getY());
        assertEquals(11, pos.getX());
    }

    @Test
    public void movedForwardSouthHeading() {
        Position pos = new Position(10, 10, mapX, mapY);
        Heading.SOUTH.moveForward(pos);
        assertEquals(9, pos.getY());
        assertEquals(10, pos.getX());
    }

    @Test
    public void movedForwardWestHeading() {
        Position pos = new Position(10, 10, mapX, mapY);
        Heading.WEST.moveForward(pos);
        assertEquals(10, pos.getY());
        assertEquals(9, pos.getX());
    }

}
