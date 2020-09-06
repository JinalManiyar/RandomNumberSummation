import java.util.*;

public class RandomNumbersSummation {

    public static void main(String[] args) {
        int upperLimit = getUpperLimit();
        generateRandomNumbers(upperLimit);
    }

    private static int getUpperLimit() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter upper limit: ");
        return sc.nextInt();
    }

    private static void generateRandomNumbers(int upperLimit) {
        Random rand = new Random();
        int[] int_random = new int[10];
        int sumE = 0, sumO = 0,temp = 0;
        int[] oddArray = new int[10];
        int[] evenArray = new int[10];

        for (int i=0;i< int_random.length;i++){
            int_random[i] = rand.nextInt(upperLimit);

            if(int_random[i] % 2!=0) {
                sumO = sumO + int_random[i];
                oddArray[i] = int_random[i];
            } else{
                sumE = sumE + int_random[i];
                evenArray[i] = int_random[i];

            }
        }
        System.out.println("Random Number Generated Array : "+ Arrays.toString(int_random));
        System.out.println("Sum of Odd Array :  "+sumO);
        System.out.println("Sum of Even Array :  "+sumE);

        if(sumO>sumE){
            HashSet<Integer> hashSet = new HashSet();
            for(int i =0; i < oddArray.length; i++){
                hashSet.add(oddArray[i]);
            }
            Object[] oddUniqueArray = hashSet.toArray();
            Arrays.sort(oddUniqueArray);
            System.out.println("Sorted Unique Odd array: "+ Arrays.toString(oddUniqueArray));
            System.out.println("Second Largest Number in Odd Array :  "+(oddUniqueArray[oddUniqueArray.length  - 2]));
         /*   for(int i=0; i < oddArray.length;i++){
                for(int j=i+1; j <oddArray.length ; j++){
                    if(oddArray[i] == oddArray[j])
                        oddArray[j] = 0;
                }
            }
            Arrays.sort(oddArray);*/
         /*   int oddArrayLength = oddArray.length;

            for (int i = 0; i < oddArrayLength; i++){
                for (int j = i+1; j < oddArrayLength; j++) {
                    if(oddArray[i] == oddArray[j]) {
                        oddArray[j] = oddArray[oddArrayLength-1];
                        System.out.println("oddArray[j] : " +oddArray[j]);
                        oddArrayLength--;
                        System.out.println("oddArrayLength : "+oddArrayLength);
                        j--;
                        System.out.println("J : "+j);
                    }
                }
            }
            int[] sortedUniqueArray = Arrays.copyOf(oddArray, oddArrayLength);
            Arrays.sort(sortedUniqueArray);
            System.out.println("Sorted Unique Odd array :  "+Arrays.toString(sortedUniqueArray));
            int index = sortedUniqueArray.length-1;
            while(sortedUniqueArray[index]==sortedUniqueArray[sortedUniqueArray.length-1]){
                    index--;
            }
            System.out.println("Second largest value of Odd Array : " + sortedUniqueArray[index]);*/
        }
        else{
            int length = evenArray.length;
            for (int i = 0; i < length; i++) {
                for (int j = i + 1; j < length; j++) {
                    if (evenArray[i] < evenArray[j]) {
                        temp = evenArray[i];
                        evenArray[i] = evenArray[j];
                        evenArray[j] = temp;
                    }
                }
            }
            System.out.println("Descending order of Even Array :  "+Arrays.toString(evenArray));
        }
    }
}
