import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class p03HeartDelivary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> hood = Arrays.stream(scanner.nextLine().split("@+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int curentPosition = 0;


        String comand = scanner.nextLine();
        while (!comand.equals("Love!")){
            String[] com = comand.split("\\s+");
            int jump = Integer.parseInt(com[1]);
            if (curentPosition+jump>= hood.size()) {
                curentPosition=0;
            }else {
                curentPosition += jump;
            }

            if (hood.get(curentPosition)>0) {
               int hurts = hood.get(curentPosition)-2;
                if (hurts<=0) {
                    hurts=0;
                    System.out.printf("Place %d has Valentine's day.%n", curentPosition);
                }
                hood.set(curentPosition, hurts);
            }else{
                System.out.printf("Place %d already had Valentine's day.%n",
                        curentPosition);
            }

            comand= scanner.nextLine();

        }

        int counter = 0;
        for (Integer integer : hood) {
            if (integer> 0) {
                counter++;
            }
        }
        System.out.printf("Cupid's last position was %d.%n", curentPosition);
        if (counter>0) {
            System.out.printf("Cupid has failed %d places.", counter);
        }else {
            System.out.printf("Mission was successful.");
        }


    }
}
