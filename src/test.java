import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class test {
    public static void main(String[] args) {
        int[] oddArray = {19, 7, 4, 7, 14, 15, 5, 13, 10, 5 };
        HashSet<Integer> hashSet = new HashSet();
        for(int i =0; i < oddArray.length; i++){
            hashSet.add(oddArray[i]);
        }
    Object[] oddUniqueArray = hashSet.toArray();
    Arrays.sort(oddUniqueArray);
    System.out.println("Second Largest Number in Odd Array :  "+(oddUniqueArray[oddUniqueArray.length  - 2]));
        System.out.println("Updated Odd Array List: "+ Arrays.toString(oddUniqueArray));

    }
}

