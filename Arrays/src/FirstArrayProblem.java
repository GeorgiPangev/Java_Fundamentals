import java.util.Arrays;
import java.util.Scanner;

public class FirstArrayProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = Arrays.stream(scanner.nextLine()
                .split(" "))
                .mapToInt(x-> Integer.parseInt(x))
                .toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("arr[%d] = %s%n", i, arr[i]);
        }
    }

}
