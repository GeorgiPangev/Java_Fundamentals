import java.util.Scanner;

public class p01ReversedString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        while (!text.equals("end")) {
            String reversed = new String();
            for (int i = text.length() - 1; i >= 0; i--) {
                reversed += text.charAt(i);
            }
            System.out.printf("%s = %s%n", text, reversed);
            text = scanner.nextLine();
        }
    }
}
