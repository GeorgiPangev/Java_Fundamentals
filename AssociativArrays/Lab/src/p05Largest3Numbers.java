import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class p05Largest3Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer[] list = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .sorted((x1,x2)-> x2.compareTo(x1))
                .limit(3)
                .toArray(Integer[]::new);


        for (int i = 0; i < list.length; i++)  {
            System.out.printf("%d", list[i]);
            if (i < list.length) {
                System.out.printf(" ");
            }

        }


    }
}
