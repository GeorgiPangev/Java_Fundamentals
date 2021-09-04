import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p01MatchFullName {
    public static void main(String[] args) {
        String regz = "\\b(?<first>[A-Z][a-z]+) (?<second>[A-Z][a-z]+)\\b";
        String text = new Scanner(System.in).nextLine();


        Pattern patern = Pattern.compile(regz);
        Matcher match = patern.matcher(text);
        while (match.find()){
            System.out.printf("%s %s ", match.group("first"),
                    match.group("second"));

        }

    }
}
