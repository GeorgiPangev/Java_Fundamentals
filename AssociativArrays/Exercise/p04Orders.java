import java.lang.reflect.Array;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;


public class p04Orders {
    static class Product{

        public  String name;
        public double price;
        public int quantiti;

          Product(String name, double price, int quantiti){
            this.name = name;
            this.price = price;
            this.quantiti = quantiti;
        }
        //static String getName
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Product> products = new ArrayList<Product>();
        String input = scanner.nextLine();

        while (!input.equals("buy")){
            String[] order = input.split("\\s+");
            String name = order[0];
            double price = Double.parseDouble(order[1]);
            int qu = Integer.parseInt(order[2]);


            boolean isConteined = false;

            for (int i = 0; i < products.size(); i++) {

                String n = products.get(i).name;
                if (n.equals(name)) {
                    products.get(i).price = price;
                    products.get(i).quantiti += qu;
                    isConteined = true;
                }

            }
            if (isConteined == false) {
                products.add(new Product(name, price, qu));

            }
            input = scanner.nextLine();
        }

        for (Product product : products) {
            System.out.printf("%s -> %.2f%n", product.name, product.price*product.quantiti);
        }


    }
}
