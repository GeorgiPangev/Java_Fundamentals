import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class p05SoftUniParkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> register = new HashMap<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
           String[] input = scanner.nextLine().split("\\s+");
            if (input[0].equals("register")) {
                if (register.containsKey(input[1])) {
                    System.out.printf(
                            "ERROR: already registered with plate number %s%n", input[2]);
                }else {
                    register.put(input[1], input[2]);
                    System.out.printf("%s registered %s successfully%n",
                            input[1], input[2]);
                }

            }else if (input[0].equals("unregister")) {
                if (register.containsKey(input[1])) {
                    register.remove(input[1]);
                    System.out.printf("%s unregistered successfully%n"
                            , input[1]);
                }else{
                    System.out.printf("ERROR: user %s not found%n", input[1]);
                }
            }

        }


        for (Map.Entry<String, String> entry : register.entrySet()) {
            System.out.println(entry.getKey()+ " -> "+ entry.getValue());
        }








    }
}
