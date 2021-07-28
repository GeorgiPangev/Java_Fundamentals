import java.util.Scanner;

public class pascalTriangle {
    public static void main(String[] args) {
        int x = new Scanner(System.in).nextInt();
        int[] oldArr = new int[x];
        for (int i = 1; i <= x; i++) {
            int[] arr = new int[i];
            for (int j = 0; j <= i-1; j++) {

                if (j==0) {
                    arr[j] = 1;
                }else if (j== i){
                    arr[j] = oldArr[j-1];
                } else {
                    arr[j] = oldArr[j] + oldArr[j-1];
                }


            }
            String[] printMe = new String[arr.length];
            for (int l  = 0; l < arr.length; l++) {
                oldArr[l] = arr[l];
                printMe[l] = String.valueOf(arr[l]);
            }
            System.out.println(String.join(" ", printMe));
        }


    }
}
