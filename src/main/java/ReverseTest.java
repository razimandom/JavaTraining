public class ReverseTest {

    public static void main(String[] args) {

        String str = "Raziman Dom";
        String str2 = "Raziman Dom";

        //use for loop
        char chars[] = str.toCharArray();

        for (int i=str.length()-1; i>=0; i--) {
            System.out.print(chars[i]);
        }

        System.out.println("");

        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb = sb.reverse();
        System.out.println(sb);

    }

}
