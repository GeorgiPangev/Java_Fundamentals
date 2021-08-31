import java.util.Scanner;

public class p04TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] banedWords = scanner.nextLine().split(", ");
        String text = scanner.nextLine();
        for (int i = 0; i < banedWords.length; i++) {
            String baned = banedWords[i];
            text= text.replace(baned, repete(baned.length()));

        }
        System.out.println(text);
    }

    private static String repete(int length) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < length; i++) {
                str.append("*");
        }
        return str.toString();
    }
}
