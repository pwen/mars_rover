package com.twu.rover;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PositionTest {

    @Test
    public void shouldIncrementCoordinatesWithinMapBoundaries () {
       Position pos = new Position(1, 2, 3, 3);
       pos.incrementX();
        assertEquals(2, pos.getX());
        pos.incrementY();
        assertEquals(3, pos.getY());
    }

    @Test
    public void shouldNotIncrementCoordinatesOutsideMapBoundaries() {
        Position pos = new Position(3, 3, 3, 3);
        pos.incrementX();
        pos.incrementY();
        assertEquals(3, pos.getX());
        assertEquals(3, pos.getY());
    }

    @Test
    public void shouldDecrementCoordinatesWithinMapBoundaries (){
        Position pos = new Position(3, 4, 5, 5);
        pos.decrementX();
        pos.decrementY();
        assertEquals(2, pos.getX());
        assertEquals(3, pos.getY());
    }

    @Test
    public void shouldNotDecrementCoordinatesOutsideMapBoundaries() {
        Position pos = new Position(0, 0, 5, 5);
        pos.decrementY();
        pos.decrementX();
        assertEquals(0, pos.getX());
        assertEquals(0, pos.getY());
    }

}
