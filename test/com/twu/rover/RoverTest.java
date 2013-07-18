package com.twu.rover;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class RoverTest {

    @Test
    public void shouldMoveCorrectlyAccordingToInstructionsWithoutHittingWalls(){
        Position pos = new Position(2, 2, 4, 4);
        Rover rover = new Rover(pos, 'N', "MMLM");
        rover.move();
        assertEquals(1, pos.getX());
        assertEquals(4, pos.getY());
        assertEquals(Heading.WEST, rover.getHeading());
    }

    @Test
    public void shouldMoveCorrectlyAccordingToInstructionsWithHittingWalls(){
        Position pos = new Position(2, 2, 4, 4);
        Rover rover = new Rover(pos, 'N', "MMMLMMMMM");
        rover.move();
        assertEquals(0, pos.getX());
        assertEquals(4, pos.getY());
        assertEquals(Heading.WEST, rover.getHeading());
    }

}
