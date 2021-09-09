import java.util.Scanner;

public class p01NationalCourt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int third = scanner.nextInt();
        int custumers = scanner.nextInt();

        int pepForHouer = first+ second+ third;
        int houehCount = 0;
        while (custumers>0){
            houehCount++;
            if (houehCount%4==0) {
                continue;

            }
            custumers-=pepForHouer;

        }
        System.out.println("Time needed: " + houehCount + " h.");
    }
}
