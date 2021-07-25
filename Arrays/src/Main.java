import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> nums = Arrays.stream(scanner.nextLine().split(" "))
                .collect(Collectors.toList());
        String input = scanner.nextLine();
        List<Integer> result = new List<Integer>;

        for (int i = 0; i < nums.size() ; i++) {
            String dijits = nums.get(i);
            int sum = 0;
            for (int j = 0; j < dijits.length()  ; j++) {
                sum+= Integer.parseInt(String.valueOf(dijits.indexOf(j)));
            }
            result.add(sum);

        }
        for (int i = 0; i < result.size(); i++) {
            int total = Integer.parseInt(String.valueOf(result.get(i)));
            if (total>= input.length()){
                while (total>=input.length())
                    total-= input.length();
            }
            System.out.print(input.charAt(total));

        }
    }
}
