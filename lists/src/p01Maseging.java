

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class Main {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            List<String> nums = Arrays.stream(scanner.nextLine().split(" "))
                    .collect(Collectors.toList());
            String inputOne = scanner.nextLine();//.replaceAll(" ", "");
            List<Character> input = new ArrayList<Character>();
            for (int i = 0; i < inputOne.length(); i++) {
                input.add(inputOne.charAt(i));
            }
           // String inputCutet = input.replaceAll(" ", "");
            ArrayList<Integer> result = new ArrayList<Integer>();

            for (int i = 0; i < nums.size() ; i++) {
                String dijits = nums.get(i);
                int sum = 0;
                for (int j = 0; j < dijits.length()  ; j++) {
                    sum+= Integer.parseInt(String.valueOf(dijits.charAt(j)));
                }
                result.add(sum);

            }
            for (int i = 0; i < result.size(); i++) {
                int total = result.get(i);
                if (total> input.size()){
                    while (total>input.size())
                        total-= input.size();
                }
                if (total <input.size() && total>=0) {
                    System.out.print(input.get(total));
                    input.remove(total);
                }


            }
        }
    }


