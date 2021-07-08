import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class p01CountCharsinaString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr = scanner.nextLine()
                .split("\\s+");

        Map<Character, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < arr.length; i++) {
            String word = arr[i];
            for (int j = 0; j < word.length(); j++) {
                Character ch = word.charAt(j);
                Integer value = map.get(ch);
                if (value==null){
                    map.put(ch, 0);
                }
                map.put(ch, map.get(ch)+1);

            }

        }
        for (Map.Entry<Character, Integer> ent: map.entrySet()
             ) {
            System.out.println(ent.getKey() + " -> " + ent.getValue());


        }
    }
}
