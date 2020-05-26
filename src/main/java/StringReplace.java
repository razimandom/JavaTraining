public class StringReplace {

    public static void main(String[] args) {

        String x = "a   b c    d   e           f";
        x = x.replaceAll("\\s","");

        System.out.println(x);

    }

}
