import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class p04WordFilter {
    public static void main(String[] args) {
        String[] arr = Arrays.stream(new Scanner(System.in).nextLine().split("\\s+"))
                .filter(x->x.length()%2==0)
                .toArray(String[]::new);

        for (String s : arr) {
            System.out.println(s);
        }


    }
}
