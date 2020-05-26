public class ArmstrongNumber {

    public static void main(String[] args) {

//        int num = 153;
        int num = 155;
        int split;
        Integer totalNum = 0;
        int c = num;

        String strOfNum = String.valueOf(num);
        char chars[] = strOfNum.toCharArray();

        while(c>0) {
            split = c % 10;
            c = c / 10;
//            System.out.println(split);
//            System.out.println(num);

            totalNum += (split*split*split);
//            System.out.println(totalNum);
        }

//        for (char c : chars) {
//            Integer i = Integer.valueOf(c);
//            System.out.println(i);
//            Integer iCube = i*i*i;
//            totalNum =+ iCube;
//        }

        System.out.println(totalNum);
        System.out.println(num);

        if (totalNum==num)
            System.out.println(num + " is an armstrong number");
        else
            System.out.println(num + " is not an armstrong number");
    }

}
