package exercise5;

import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number count: ");
        int numberCount = input.nextInt();

        int[] numbers = new int[numberCount];

        System.out.println("Enter numbers: ");
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = input.nextInt();
        }

        System.out.print("Search for number: ");
        int number = input.nextInt();

        int numberIndex = -1;
<<<<<<< HEAD
        for (int index = 0; index < numbers.length; index++) {
          if(number==numbers[index]){
          numberIndex=index;
          break;
          }}

        
=======
       
>>>>>>> 12661e09d41cd4dda07fdeed8834cf20754d7368

        System.out.println("Number index: " + numberIndex);
    }
}