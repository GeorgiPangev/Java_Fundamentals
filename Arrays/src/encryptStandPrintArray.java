import java.util.Arrays;
import java.util.Scanner;

public class encryptStandPrintArray {
    public static void main(String[] args) {


        char[] vovel = {'a', 'e', 'i', 'o', 'u'};
        Scanner scanner = new Scanner(System.in);
        int x = Integer.parseInt(scanner.nextLine());
        String[] strarr = new String[x];
        int[] ints = new int[x];



        for (int i = 0; i < x ; i++) {
            int sum= 0;
            String str = strGeter(scanner, strarr, i);
            //
            for (int j = 0; j < str.length(); j++) {

                switch (str.charAt(j))
                {
                    case 'A':
                    case 'a':
                    case 'E':
                    case 'e':
                    case 'I':
                    case 'i':
                    case 'o':
                    case 'O':
                    case 'U':
                    case 'u':
                        sum +=(int)str.charAt(j)*str.length();
                        break;
                    default:
                        sum+= (int)str.charAt(j)/str.length();


                }
            }
            ints[i]= sum;


        }
        for (int i = 0; i < x; i++) {
            System.out.printf("%s = %d%n", strarr[i], ints[i]);
        }

    }

    private static String strGeter(Scanner scanner, String[] strarr, int i) {
        strarr[i] = scanner.nextLine();
        String str = strarr[i].toString();
        return str;
    }

}
