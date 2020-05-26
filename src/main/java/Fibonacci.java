public class Fibonacci {

    public static void main(String[] args) {

        int a=0,b=0,c=1;

        for (int x=0; x<10; x++) {
            a=b;
            b=c;
            c=a+b;

            System.out.println(a);

        }
    }

}
