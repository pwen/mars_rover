package com.twu.rover;

import java.io.*;

public class MyFileReader {
    private Queue<Rover> queue = new Queue<Rover>();
    private int mapX;
    private int mapY;

    public MyFileReader(Queue<Rover> queue){
            this.queue = queue;
    }

    public void read(String fileName) {
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader(fileName));
            String line = "";
            int i = 1;
            try {
                while ((line = reader.readLine()) != null){
                    String[] ln = null;
                    if (i == 1) {
                        ln = line.split("\\s+");
                        mapX = Integer.parseInt(ln[0]);
                        mapY = Integer.parseInt(ln[1]);
                        i++;
                    } else if (i%2 == 0) {
                        ln = line.split("\\s+");
                        String nextLine = "";
                        if ((nextLine = reader.readLine()) != null) {
                            Position pos = new Position(Integer.parseInt(ln[0]), Integer.parseInt(ln[1]), mapX, mapY);
                            Rover r = new Rover(pos, ln[2].charAt(0), nextLine);
                            queue.enqueue(r);
                        }
                    }

                }
            } catch (IOException e) {
                System.out.println("Error: Invalid input.");
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found. Please try again.");
        }

    }
}

