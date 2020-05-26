import java.util.HashMap;

public class CountWords {

    public static void main(String[] args) {

        String str = "This this is is done by Saket Saket";
        String[] split = str.split(" ");
        HashMap<String, Integer> hm = new HashMap<String, Integer>();

        for (int i =0; i<split.length-1; i++) {

            if (hm.containsKey(split[i])) {
                int count = hm.get(split[i]);
                hm.put(split[i], count+1);

            } else {
                hm.put(split[i], 1);
            }

        }

        System.out.println(hm);


    }

}
