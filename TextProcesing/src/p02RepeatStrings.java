import java.lang.reflect.Array;
import java.util.Scanner;

public class p02RepeatStrings {
    public static void main(String[] args) {
        String[] input = new Scanner(System.in)
                .nextLine().split("\\s+");
        StringBuilder stb = new StringBuilder();
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length(); j++) {
                stb.append(input[i]);
            }            
        }
        System.out.println(stb.toString());
    }
}
