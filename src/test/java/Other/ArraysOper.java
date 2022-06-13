package Other;

import java.util.Arrays;

public class ArraysOper {

    public static void main(String[] args) {

        int[] intArray = {24, 340, 0, 34, 12, 10, 20};
        Arrays.sort(intArray);
        int maxNum = intArray[intArray.length - 1];
        int minNum = intArray[intArray[0]];
        int lengthArray = intArray.length;
        System.out.println("Max number = " + maxNum);
        System.out.println("Min number = " + minNum);
        System.out.println("Array length =" + lengthArray);

        String[] namesArray = {"Ann", "John"};
        System.out.println(Arrays.toString(namesArray));
    }

}
