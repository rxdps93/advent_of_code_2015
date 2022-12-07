package day04.puzzle1;

import utils.InputParser;
import utils.MD5;

public class d4p1 {

    public static void main(String [] args) {
        String key = new InputParser("day04/input.txt").readLinesAsArray()[0];

        int num = 1;
        String input = key + num;
        while (!MD5.of(input).substring(0, 5).equals("00000")) {
            num++;
            input = key + num;
        }

        System.out.println(num);
    }
}
