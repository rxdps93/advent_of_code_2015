package day05.puzzle1;

import utils.InputParser;

import java.util.List;
import java.util.regex.Pattern;

public class d5p1 {

    private static void parseVowels(List<String> lines) {

        final String vowels = "aeiou";

        for (int i = 0; i < lines.size(); i++) {
            int vc = 0;
            for (int c = 0; c < lines.get(i).length(); c++) {
                if (vowels.contains(Character.toString(lines.get(i).charAt(c)))) {
                    vc++;
                }

                if (vc == 3) {
                    break;
                }
            }

            if (vc < 3) {
                System.out.println("removing " + lines.get(i));
                lines.remove(i);
            }
        }
    }

    private static void parseVowelsRegex(List<String>lines) {

        final String regex = "[aeiou]+";

        for (int i = 0; i < lines.size(); i++) {
            if (!Pattern.matches(regex, lines.get(i))) {
                System.out.println("removing " + lines.get(i));
                lines.remove(i);
            }
        }
    }

    private static void parseDoubles(List<String> lines) {

        final String regex = ".*(([a-z])(\\2)).*";

        for (int i = 0; i < lines.size(); i++) {
            if (!Pattern.matches(regex, lines.get(i))) {
                System.out.println("removing " + lines.get(i));
                lines.remove(i);
            }
        }
    }

    private static void parseForbidden(List<String> lines) {
        final String[] forbidden = { "ab", "cd", "pq", "xy" };
    }

    public static void main(String[] args) {
        List<String> lines = new InputParser("day05/testInput.txt").readLinesAsList();

//        System.out.println("vowel check");
//        parseVowels(lines);
        System.out.println("now with regex");
        parseVowelsRegex(lines);
//        System.out.println("double check");
//        parseDoubles(lines);

        System.out.println(lines.size());
    }
}
