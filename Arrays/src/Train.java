import java.util.Arrays;
import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            int in = scanner.nextInt() ;
            arr[i] = in;

        }
        for (int num: arr
             ) {
            System.out.print(num + " ");

        }
        int sum = Arrays.stream(arr).sum();
        System.out.printf("%n%d", sum);
    }
}
