public class SecondHighestNum {

    public static void main(String[] args) {

        int arr[] = {1,3,5,2,6,7,10,9};

        int largest=0;
        int secondLargest=0;

        for (int i=0; i<arr.length; i++) {

            if (arr[i] > largest) {
                secondLargest=largest;
                largest=arr[i];

            } else if (arr[i] > secondLargest){
                secondLargest=arr[i];
            }

        }

        System.out.println(largest + " largest number");
        System.out.println(secondLargest + " second largest number");

    }

}
