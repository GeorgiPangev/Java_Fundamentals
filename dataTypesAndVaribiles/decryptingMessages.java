import java.util.Scanner;

public class decryptingMessages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int key = Integer.parseInt(scanner.nextLine());
        int x = Integer.parseInt(scanner.nextLine());
        String str = "";
        for (int i = 0; i< x;i++){
            //String tt = scanner.nextLine();
            char ch = scanner.nextLine().charAt(0);
            //int all = (int)ch + key;
            ch += key;
            //str= str+ch;
            str = str+ch ;


        }
        System.out.print(str);
        //System.out.println(str);
    }
}
