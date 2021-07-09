import java.util.*;

public class p02MinerTasck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Long> goods = new LinkedHashMap<>();
        String good = scanner.nextLine();

        while (!good.equals("stop")){
           // String longe = scanner.nextLine();
            long quantiti = Long.parseLong(scanner.nextLine());
            Long x  = goods.get(good);
            if (x== null) {
                goods.put(good, (long)0);
            }
            goods.put(good, goods.get(good)+quantiti);

            good = scanner.nextLine();

        }

        for (Map.Entry<String, Long> entry : goods.entrySet()) {
            System.out.println(entry.getKey() + " -> "+ entry.getValue());
        }
            


    }
}
