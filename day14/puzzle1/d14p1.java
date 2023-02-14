package day14.puzzle1;

import utils.InputParser;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class d14p1 {

    private static class Reindeer {

        public final String name;
        public final int speed;
        public final int duration;
        public final int rest;
        public int canMoveOn = 0;

        public Reindeer(String name, int speed, int duration, int rest) {
            this.name = name;
            this.speed = speed;
            this.duration = duration;
            this.rest = rest;
        }
    }

    public static void main(String[] args) {

        List<String> input = InputParser.parse("day14/test.txt").asList();

        List<Reindeer> reindeers = new ArrayList<>();
        input.forEach(line -> {
            String[] tokens = line.split(" ");
            reindeers.add(new Reindeer(
                    tokens[0],
                    Integer.parseInt(tokens[3]),
                    Integer.parseInt(tokens[6]),
                    Integer.parseInt(tokens[tokens.length - 2])));
        });


    }
}
