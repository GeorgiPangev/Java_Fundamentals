import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p02MatchPfoneNumbers {
    public static void main(String[] args) {
        String text = new Scanner(System.in).nextLine();
        Pattern pattern = Pattern.compile("\\+359(-?\\ ?)2\\1[\\d]{3}\\1[\\d]{4}\\b");
        Matcher match = pattern.matcher(text);
        while (match.find()){
            System.out.printf("%s%n", match.group());
        }
    }
}
