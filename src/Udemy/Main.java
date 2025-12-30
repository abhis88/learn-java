package Udemy;

import java.util.Arrays;
import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }

        System.out.println("Java Version Used: v" + System.getProperty("java.version"));

        //Arrays
        int[] arraysDemo = new int[10];
        arraysDemo[0] = 90;
        System.out.println(arraysDemo[0]);

        int[] firstTen = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int arrayLength = firstTen.length;
        System.out.println(arrayLength);

        //for loop
        for (int i = 0; i < firstTen.length; i++) {
            System.out.println(i);
        }
        System.out.println("----Arrays----");

        //Enhanced for loop
        for (int i : firstTen) {
            System.out.println(i);
        }

        System.out.println("-------"+ Arrays.toString(firstTen));

        //Arrays.util
        System.out.println(Arrays.toString(firstTen));

        //Sort method
        int[] firstArray = getRandomArray(10);
        Arrays.sort(firstArray);
        System.out.println(Arrays.toString(firstArray));

        //fill method
        int[] secondArray = new int[10];
        System.out.println(Arrays.toString(secondArray));
        Arrays.fill(secondArray, 5);
        System.out.println(Arrays.toString(secondArray));

        //descending array
        int[] thirdArray = getRandomArray(10);
        Arrays.sort(thirdArray);
        System.out.println(Arrays.toString(thirdArray));
        for(int i = thirdArray.length; i>0; i--){
            System.out.println(thirdArray[i-1]);
        }
    }

    public static int[] getRandomArray(int len){

        Random random = new Random();
        int[] newInt = new int[len];

        for(int i=0; i <len; i++){
            newInt[i] = random.nextInt(100);
        }

        return newInt;
    }
}