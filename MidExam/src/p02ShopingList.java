import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class p02ShopingList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = Arrays.stream(scanner
                .nextLine().split("!"))
                .collect(Collectors.toList());
        String comant = scanner.nextLine();
        while (!comant.equals("Go Shopping!")){
            String[] comand = comant.split("\\s+");
            if (comand[0].equals("Urgent")) {
                if (!list.contains(comand[1])) {
                    String product = comand[1];
                    list.remove(product);
                    list.add(0, product);
                }
                
            }else if (comand[0].equals("Unnecessary")) {
                Integer index = list.indexOf(comand[1]);
                if (index != null) {
                    list.remove(index);
                }


                
            }else if (comand[0].equals("Correct")) {
                if (list.contains(comand[1])) {
                    int ind = list.indexOf(comand[1]);
                    list.remove(ind);
                    list.add(ind, comand[2]);
                }

            }else if (comand[0].equals("Rearrange")) {
                if (list.contains(comand[1])) {
                    int ind = list.indexOf(comand[1]);
                    list.remove(ind);
                    list.add(comand[1]);
                }
            }
            
            comant= scanner.nextLine();
        }
        System.out.println(String.join(", ", list));
    }
}
