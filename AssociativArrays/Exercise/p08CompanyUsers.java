import java.lang.reflect.Array;
import java.util.*;

public class p08CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, ArrayList<String>> list = new HashMap<>();
        String input = scanner.nextLine();
        while (!input.equals("End")){
            String[] user = input.split("->");

            if (list.containsKey(user[0])) {
                if (!list.get(user[0]).contains(user[1])) {
                    list.get(user[0]).add(user[1]);
                } else {
                    input = scanner.nextLine();
                    continue;
                }
            }else {
                list.put(user[0], new ArrayList<String>());
                list.get(user[0]).add(user[1]);
            }
            input = scanner.nextLine();
        }


        list.entrySet()
                .stream().sorted((f,s)-> f.getKey().compareTo(s.getKey()))
                .forEach(e->{
                    System.out.println(e.getKey());
                    e.getValue()
                            .stream()
                            .forEach(c-> {
                                System.out.printf("-- %s%n", c);
                            });
                });
    }
}
