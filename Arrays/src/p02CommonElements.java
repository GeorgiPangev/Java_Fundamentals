import java.util.Scanner;

public class p02CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] first = scanner.nextLine().split(" ");
        String[] second  = scanner.nextLine().split(" ");
        //String[] sumari = new String[first.length];
        //if (first.length>= second.length) {
        for (int i = 0; i < second.length; i++) {
                String firststr = second[i];
            for (int j = 0; j < first.length; j++) {
                if (firststr.equals(first[j])) {
                    System.out.print(firststr + " ");

                }
            }
                

        }

    }
}
