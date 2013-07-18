package com.twu.rover;

import static junit.framework.TestCase.assertFalse;

public class Rover {

    private Position position;
    private Heading heading;
    private String instructions;

    public Rover (Position position, char direction, String instructions){
        this.position = position;
        if (direction == 'N') this.heading = Heading.NORTH;
        else if (direction == 'S') this.heading = Heading.SOUTH;
        else if (direction == 'E') this.heading = Heading.EAST;
        else if (direction == 'W') this.heading = Heading.WEST;
        this.instructions = instructions;
    }

    public void move() {
        for (int i = 0; i < instructions.length(); i++){
            char instruction = instructions.charAt(i);
            if (instruction == 'R') heading = heading.turnRight();
            else if (instruction == 'L') heading = heading.turnLeft();
            else if (instruction == 'M') {
                heading.moveForward(position);
            }
        }
    }

    public Position getPosition() {
        return position;
    }

    public Heading getHeading() {
        return heading;
    }
}
