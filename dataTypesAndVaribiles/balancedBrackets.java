import java.util.Scanner;

public class balancedBrackets {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int x = Integer.parseInt(scanner.nextLine());
        int open = 0;
        int close = 0;

        for (int i = 0; i<x; i++){

            String str = scanner.nextLine();

            if (str.length()==1){

                char ch = str.charAt(0);

                if (ch == '('){
                    open++;

                } else if (ch == ')'){
                    close++;
                }
            }

        }
        if (open==close){
            System.out.printf("BALANCED");

        }else {
            System.out.println("UNBALANCED");
        }
    }
}
