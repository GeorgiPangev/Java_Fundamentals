import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class p06Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, ArrayList<String>> list = new HashMap<>();
        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String[] cours = input.split(" : ");
            list.putIfAbsent(cours[0], new ArrayList<>());
            if (list.get(cours[0]).contains(cours[1])) {
                input = scanner.nextLine();
                continue;
            } else {
                list.get(cours[0]).add(cours[1]);

            }
            input = scanner.nextLine();
        }

        list.entrySet()
                .stream().sorted((f,s) ->s.getValue().size()-f.getValue().size())
                .forEach(e-> {
                    System.out.println(e.getKey()+": "+ e.getValue().size());
                    e.getValue()
                            .stream()
                            .sorted((f, s)-> f.compareTo(s))
                            .forEach(s -> {System.out.println("-- "+ s);});

                });



    }
}
