package com.twu.rover;

public class Main {

    public static void main(String args[]){

        String fileName = "input";
        Queue<Rover> q = new Queue<Rover>();
        MyFileReader fileReader = new MyFileReader(q);
        fileReader.read(fileName);

        int size = q.size();
        for (int i=0; i<size; i++){
            Rover rover = q.dequeue();
            rover.move();
            Position pos = rover.getPosition();
            System.out.printf("%d %d %s\n", pos.getX(), pos.getY(), rover.getHeading().toString());
        }

    }
}
