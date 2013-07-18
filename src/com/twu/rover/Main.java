package com.twu.rover;

public class Main {

    public static void main(String args[]){

        Queue<Rover> q = new Queue<Rover>();
        MyFileReader fileReader = new MyFileReader(q);
        fileReader.read(args[0]);

        int size = q.size();
        for (int i=0; i<size; i++){
            Rover rover = q.dequeue();
            rover.move();
            Position pos = rover.getPosition();
            System.out.printf("%d %d %c\n", pos.getX(), pos.getY(), rover.getHeading().toString());
        }

    }
}
