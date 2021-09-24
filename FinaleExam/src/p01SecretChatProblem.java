import java.util.Scanner;

public class p01SecretChatProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String sc = scanner.nextLine();
        while (!sc.equals("Reveal")){
            String[] comand = sc.split("[\\:|:]+");

            if (comand[0].equals("ChangeAll")) {

                text = text.replaceAll(comand[1], comand[2]);
                System.out.printf("%s%n", text);
                
            }else if (comand[0].equals("Reverse")) {
                Integer indexOfSub = text.indexOf(comand[1]);
                if (indexOfSub >=0) {

                    String substr = text.substring(indexOfSub, indexOfSub+comand[1].length());
                    substr = reverseSubstr(substr);
                    text = text.replace(comand[1], "");
                    text += substr;

                    System.out.printf("%S%n", text);

                }else {
                    System.out.println("error");
                }

                
            }else if (comand[0].equals("InsertSpace")) {

                StringBuilder strb = new StringBuilder(text);
                strb.insert(Integer.parseInt(comand[1]), " ");
                text= strb.toString();

                System.out.printf("%s%n", text);
            }

            sc = scanner.nextLine();
        }

        System.out.printf("You have a new text message: %s%n", text);

    }

    private static String reverseSubstr(String substr) {

        StringBuilder res = new StringBuilder();
        for (int i = substr.length()-1; i >=0  ; i--) {
            res.append(substr.charAt(i));
        }
        return res.toString();
    }
}
