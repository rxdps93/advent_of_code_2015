package day04.puzzle1;

import utils.InputParser;
import utils.MD5;

public class d4p1 {

    public static void main(String [] args) {
        String key = new InputParser("day04/input.txt").readLinesAsArray()[0];

        String code = "abcdef609043";

        System.out.println(MD5.of(code));
    }
}
