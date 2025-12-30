package Udemy.Challenges.MinimumElement;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class MinimumElementChallenge {

    static void main() {
        System.out.println("Hello, World!");
        getUserInput();
    }

    static int[] getUserInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter comma separated numbers to find our minimum between them");
        String commaSeparatedNumberFromUserInput = scanner.nextLine();
        scanner.close();

        if(validateInput(commaSeparatedNumberFromUserInput)){
            System.out.println(findMinimum(commaSeparatedNumberFromUserInput));
            return null;
        }else{
            System.out.println("Please input comma separated numbers only");
            getUserInput();
        }
        return null;
    }

    static boolean validateInput(String input){
        String[] userInput = input.split(",");
        for(String i: userInput){
            int x = Integer.parseInt(i);
            if(x >=0 && x <= 32000){
                continue;
            }
            else{
                return false;
            }
        }
        return true;
    }

    static int findMinimum(String input){

        String[] userInput = input.split(",");
        int[] userInputInteger = new int[userInput.length];

        for(int i=0; i <userInput.length; i++){
            userInputInteger[i] = Integer.parseInt(userInput[i]);
        }

        boolean flag = true;

        while(flag){
            System.out.println(Arrays.toString(userInputInteger));
            flag = false;
            for(int i=0; i < userInputInteger.length-1; i++){
                if(userInputInteger[i] > userInputInteger[i+1]){
                    var temp = userInputInteger[i+1];
                    userInputInteger[i+1] = userInputInteger[i];
                    userInputInteger[i] = temp;
                    flag = true;
                }
            }
        }

        return userInputInteger[0];
    }
}
