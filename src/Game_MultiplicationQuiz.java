import java.util.Scanner;

public class Game_MultiplicationQuiz {
    public static void main(String[] args)   {
        Scanner input = new Scanner(System.in);

        // The purpose of this program is to generate two random numbers and subtract the second from the first

        // Generate two random single-digit integers, between 0 and 999
            // First randomly generated number
        int firstDigitInNumber1 = (int)(Math.random() * 10); // Here im generating a number in the 10^1 scale
        int secondDigitInNumber1 = (int)(Math.random() * 100); // Generating a number int the 10^2 scale
        int thirdDigitInNumber1 = (int)(Math.random() * 1000); // Generating a number in the 10^3 scale
        int number1 = firstDigitInNumber1 + secondDigitInNumber1 + thirdDigitInNumber1;

            // Second we generate the second number from the same method
        int firstDigitInNumber2 = (int)(Math.random() * 10); // Here im generating a number in the 10^1 scale
        int secondDigitInNumber2 = (int)(Math.random() * 100); // Generating a number int the 10^2 scale
        int thirdDigitInNumber2 = (int)(Math.random() * 1000); // Generating a number in the 10^3 scale
        int number2 = firstDigitInNumber2 + secondDigitInNumber2 + thirdDigitInNumber2;

               //Prompt the student to answer "What is number1 x number2?"
        System.out.print("What is " + number1 + " x " + number2 + "? ");
        int answer = input.nextInt();

        // 4. Grade the answer and display the result
        if (number1 * number2 == answer) {
            System.out.println("Soooo very true!!!");
        }
        else {
            System.out.println("You suck!!!");
            System.out.println(number1 + " x " + number2 + " Should be...." + (number1 * number2));
        }
    }
}