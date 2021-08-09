import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class p03TakeSkipRope {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Character> chars  = new ArrayList<Character>();
        List<Integer> nums = new ArrayList<>();
        String input = scanner.nextLine();
        for (int i = 0; i < input.length(); i++) {
            if (Character.isDigit(input.charAt(i))){
                nums.add(Integer.parseInt(String.valueOf(input.charAt(i))));
            }else {
                chars.add(input.charAt(i));
            }

        }
        List<Character> result = new ArrayList<>();
        int counter = 0;
        boolean toSckip = false;
        for (int i = 1; i <= nums.size(); i++) {
            if (counter< chars.size()) {
                if (i%2==1) {
                    int take = nums.get(i - 1);
                    for (int j = 0; j < take; j++) {
                        result.add(chars.get(counter));
                        counter++;
                        if (counter>= chars.size()) {
                            break;
                        }

                    }
                } else {
                    int scip = nums.get(i-1);
                    for (int j = 0; j < scip; j++) {
                        counter++;
                        if (counter>= chars.size()) {
                            break;
                        }

                    }
            }

            }



        }
        for (char ch: result
             ) {
            System.out.print(ch);

        }

    }
}
