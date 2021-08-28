import java.util.Scanner;

public class p04DigitsLettersandOther {
    public static void main(String[] args) {
        String text = new Scanner(System.in).nextLine();
        StringBuilder chars = new StringBuilder();
        StringBuilder digits = new StringBuilder();
        StringBuilder symbols = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            if (Character.isLetter(text.charAt(i))) {
                chars.append(text.charAt(i));

            }else if (Character.isDigit(text.charAt(i))) {
                digits.append(text.charAt(i));

            }else{
                symbols.append(text.charAt(i));
            }
        }
        System.out.println(digits.toString());
        System.out.println(chars.toString());
        System.out.println(symbols.toString());



    }
}
