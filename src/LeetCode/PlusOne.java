package LeetCode;

import java.util.Arrays;

public class PlusOne {
    static void main() {
        System.out.println(Arrays.toString(plusOne(new int[]{9,8,7,6,5,4,3,2,1,0})));
    }

    public static int[] plusOne(int[] digits) {

        //convert to string
        Integer result = 0;
        for(int num : digits){
            result = result * 10 + num;
        }

        result = result + 1;

        //convert back to int[]
        int[] output = Integer.toString(result)
                .chars()
                .map(Character::getNumericValue)
                .toArray();

        return output;
    }

}
