package day08.puzzle1;

import utils.InputParser;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class d8p1 {



    public static void main(String [] args) {
        List<String> lines = new InputParser("day08/input.txt").readLinesAsList();

        int strSum = 0;
        int memSum = 0;

        Pattern pattern = Pattern.compile("\\\\x[0-9|A-F]{2}");
        for (String line : lines) {
            strSum += line.length();
            String str = line.substring(1, line.lastIndexOf("\""))
                    .replace("\\\"", "\"")
                    .replace("\\\\", "\\");

            Matcher matcher = pattern.matcher(str);
            while (matcher.find()) {
                String hex = matcher.group().substring(2);
                str = str.replace(matcher.group(0), Character.toString((char)Integer.parseInt(hex, 16)));
            }

            memSum += str.length();

            System.out.printf("%10s\t%d\n", line, line.length());
            System.out.printf("%10s\t%d\n\n", str, str.length());
        }

        System.out.println("The answer is " + (strSum - memSum));
    }
}
