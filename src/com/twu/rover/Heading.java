package com.twu.rover;

public interface Heading {

    public static final Heading NORTH = new NorthHeading();
    public static final Heading EAST = new EastHeading();
    public static final Heading SOUTH = new SouthHeading();
    public static final Heading WEST = new WestHeading();

    void moveForward(Position position);
    Heading turnRight();
    Heading turnLeft();

    static class NorthHeading implements Heading {
        public void moveForward(Position position) {
            position.incrementY();
        }
        public Heading turnRight() {
            return EAST;
        }
        public Heading turnLeft() {
            return WEST;
        }
        public String toString() {
            return "N";
        }
    }

    static class EastHeading implements Heading {
        public void moveForward(Position position) {
            position.incrementX();
        }
        public Heading turnRight() {
            return SOUTH;
        }
        public Heading turnLeft() {
            return NORTH;
        }
        public String toString() {
            return "E";
        }
    }

    static class SouthHeading implements Heading {
        public void moveForward(Position position) {
            position.decrementY();
        }
        public Heading turnRight() {
            return WEST;
        }
        public Heading turnLeft() {
            return EAST;
        }
    }

    static class WestHeading implements Heading {
        public void moveForward(Position position) {
            position.decrementX();
        }
        public Heading turnRight() {
            return NORTH;
        }
        public Heading turnLeft() {
            return SOUTH;
        }
    }
}
