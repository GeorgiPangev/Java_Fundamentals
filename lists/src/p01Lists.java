import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class p01Lists {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);

        List<Integer> raw = (List<Integer>) Arrays.stream(scaner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        for (int i = 0; i < raw.size(); i++) {
            System.out.println(raw.get(i));

        }

        }

    }

