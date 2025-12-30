package Udemy;

import java.util.Arrays;

public class ReverseArrayInplace {

    static void main() {
        int[] input = {5,4,3,2,1,90};
        System.out.println(Arrays.toString(input));
        System.out.println(Arrays.toString(reverseArray(input)));
    }

    static int[] reverseArray(int[] input){

        for(int i=0; i< input.length/2; i++){
            var temp = input[i];
            input[i] = input[input.length-i-1];
            input[input.length-i-1] = temp;
        }

        return input;
    }
}
