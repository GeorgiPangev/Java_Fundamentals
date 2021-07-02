import java.lang.reflect.Array;
import java.util.*;

public class p02Sinonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<String>> dict = new LinkedHashMap<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String inputOne = scanner.nextLine();
           // String inputTwo = scanner.nextLine();
             dict.putIfAbsent(inputOne, new ArrayList<String>());
             dict.get(inputOne).add(scanner.nextLine());
        }

        for (Map.Entry<String, List<String>> entr: dict.entrySet()){
            System.out.println(entr.getKey()+" - "+
                    String.join(", ", entr.getValue()));
        }
    }
}
