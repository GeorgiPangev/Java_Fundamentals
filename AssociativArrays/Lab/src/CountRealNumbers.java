import java.util.*;

public class CountRealNumbers {
    public static void main(String[] args) {
        double[] input = Arrays.stream(new Scanner(System.in).nextLine()
                .split("\\s+"))
                .mapToDouble(Double::parseDouble)
                .toArray();
        Map<Double, Integer> result = new TreeMap<>();
        for (double num: input
             ) {
            Integer n = result.get(num);
            if (n == null) {
                result.put(num, 0);
            }
            result.put(num, result.get(num)+1);


        }
        for (Map.Entry<Double, Integer> entry: result.entrySet()
             ) {
            System.out.printf("%.0f -> %d%n", entry.getKey(), entry.getValue());
        }
    }
}
