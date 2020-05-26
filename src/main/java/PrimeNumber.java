import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {


        int temp;
        int num;


        while (true) {

            boolean isPrime = true;

            Scanner in = new Scanner(System.in);
            num = in.nextInt();
//            in.close();

            for (int i=2; i<=num/2; i++) {
                temp = num%i;
                if (temp==0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime)
                System.out.println(num + " is prime");
            else
                System.out.println(num + " is not prime");

        }



    }


}
