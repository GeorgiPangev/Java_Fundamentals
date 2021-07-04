import javax.swing.plaf.basic.BasicGraphicsUtils;
import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class p03OddOcurrences {
    public static void main(String[] args) {
       // Scanner scanner = new Scanner(System.in);
        String[] input = new Scanner(System.in).nextLine()
                .split(" ");

        Map<String, Integer> map  =new LinkedHashMap<>();
        for (String str: input
             ) {
            String word = str.toLowerCase();
            map.putIfAbsent(word, 0);
            map.put(word, map.get(word)+1);

        }
        List<String> print = new ArrayList<>();
        for (Map.Entry<String, Integer> entri: map.entrySet()
             ) {
            if (entri.getValue()%2==1){
                print.add(entri.getKey());
            }
        }
        System.out.println(String.join(", ", print));







    }
}
