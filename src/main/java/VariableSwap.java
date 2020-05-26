public class VariableSwap {

    public static void main(String[] args) {

        int x = 10;
        int y = 20;
        int z;

        System.out.println("" + x + " " + y);

        z = y;
        y = x;
        x = z;

        System.out.println("" + x + " " + y);




    }

}
