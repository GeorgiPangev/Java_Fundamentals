import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;


public class p03LadiBug {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fieldSize = Integer.parseInt(scanner.nextLine());
        int[] field = new int[fieldSize];
        int[] bugs = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(x -> Integer.parseInt(x))
                .toArray();

        for (int i = 0; i < bugs.length ; i++) {
            field[bugs[i]] = 1;

        }

       String[] input = scanner.nextLine().split(" ");
        while (!input[0].equals("end")) {

            if ((input[1].equals("right") && Integer.parseInt(input[0]) >= 0
                    && Integer.parseInt(input[0]) < field.length)
                    || (Integer.parseInt(input[2]) < 0 && Integer.parseInt(input[0]) >= 0
                    && Integer.parseInt(input[0]) < field.length)) {
                int start = Integer.parseInt(input[0]);
                int fligt = Math.abs(Integer.parseInt(input[2]));
                int lendingInt = start + fligt;
                field[start] = 0;
                if (field.length > lendingInt && lendingInt > 0 && field[lendingInt] == 0) {
                    field[lendingInt] = 1;
                } else if (lendingInt >= fieldSize) {
                    break;
                } else if (field[lendingInt] == 1) {
                    boolean isLend = false;
                    while (lendingInt < field.length && field[lendingInt] == 1 && !isLend) {

                        if (lendingInt < field.length && field[lendingInt] == 0) {
                            field[lendingInt] = 1;
                            isLend = true;
                        } else if (lendingInt < field.length && field[lendingInt] == 1) {
                            lendingInt += fligt;
                        } else if (lendingInt >= field.length) {
                            break;

                        }

                    }
                }
            }
            if (input[1] == ("left") && Integer.parseInt(input[0]) >= 0
                    && Integer.parseInt(input[0]) < field.length) {//&& Integer.parseInt(input[0])== 1) {
                int start = Integer.parseInt(input[0]);
                int fligt = Integer.parseInt(input[2]);
                int lendingInt = start - Math.abs(fligt);
                field[start] = 0;
                if (field.length > lendingInt && lendingInt > 0 && field[lendingInt] == 0) {
                    field[lendingInt] = 1;
                } else if (lendingInt < 0) {
                    break;
                } else if (field[lendingInt] == 1) {
                    boolean isLend = false;
                    while (lendingInt < field.length && lendingInt >= 0 && field[lendingInt] == 1 && !isLend) {


                        if (lendingInt >= 0 && field[lendingInt] == 0) {
                            field[lendingInt] = 1;
                            isLend = true;
                        } else if (lendingInt > 0 && field[lendingInt] == 1) {
                            lendingInt -= fligt;
                        } else if (lendingInt >= 0) {
                            break;

                        }
                    }
                }
            }


            input = scanner.nextLine().split(" ");
        }


        for (int num: field
             ) {
            System.out.printf("%d ", num);
        }


    }

}
