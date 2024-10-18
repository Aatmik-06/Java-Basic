// 1.	Write a program to accept two integer numbers from user. And perform addition and substraction. Display the reuslts of the operation on console.
import java.util.Scanner;
class AdditionSub{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number");
        int number1 = scanner.nextInt();

        System.out.println("Enter Second number");
        int number2 = scanner.nextInt();

        System.out.println("Addition = " + (number1+number2));

        System.out.println("Substraction = " + (number1-number2));


    }
}