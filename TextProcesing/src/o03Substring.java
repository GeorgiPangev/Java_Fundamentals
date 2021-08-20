import java.util.Scanner;

public class o03Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        String text = scanner.nextLine();
        //StringBuilder result = new StringBuilder(text.length());

        int curentIndex = 0;
        int indexOfSubstr = text.indexOf(word);
        while (indexOfSubstr>-1){
          text = text.replace(word, "");
          indexOfSubstr= text.indexOf(word);

        }
        //result.append(text.substring(curentIndex, text.length()));
        //System.out.printf("%s%n", result.toString());
        System.out.printf("%s%n", text);
    }
}
