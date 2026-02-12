import java.util.Scanner;

public class Looping13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //2 digit terakhir
        System.out.println("Input Your Last 2 Digits of NIM: ");
        double n = sc.nextDouble();

        //check the condition
        if (n<10){
            n=n+10;
        }

        //loop until n
        for (int i=1; i<=n; i++) {
            if (i == 10 || i == 15) {
                continue;
            }
            if (i % 3 == 0) {
                System.out.print("#");
            }else if (i % 2 == 0) {
                System.out.print(i);
            }else {
                System.out.print("*");
            }
        }
        sc.close();

    }
}