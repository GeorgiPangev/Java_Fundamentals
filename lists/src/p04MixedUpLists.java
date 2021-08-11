import java.util.*;
import java.util.stream.Collectors;

public class p04MixedUpLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> first = Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> second = Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .map(x-> Integer.parseInt(x))
                .collect(Collectors.toList());

        List<Integer> result = new ArrayList<>();
        int x = 0;
        int y = 0;
        int n = 0;

        if (first.size()>second.size()){
            //int dif = first.size()- second.size();
            x = first.get(first.size()-1);
            y = first.get(first.size()-2);
            n= second.size()-1;

        } else  if (first.size()<second.size()) {
            x = second.get(0);
            y = second.get(1);
            n = first.size()-1;
        }
        int min = Math.min(x, y);
        int max = Math.max(x,y);

        for (int i = 0; i <= n; i++) {
            int fi = first.get(i);
            int sec =  second.get(second.size()-1 - i);
            if (min < fi && fi <max) {
                result.add(first.get(i));
            }
            if (min < sec&& sec  < max) {
                result.add(second.get(second.size()-1 - i));
            }
        }


        Collections.sort(result);


        for (int num : result
             ) {
            System.out.printf("%d ", num);

        }


    }
}
