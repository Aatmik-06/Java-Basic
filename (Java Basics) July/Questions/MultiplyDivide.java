// 2.	Write a program to accept two floating point numbers from user. And perform multiplication and division on the numbers. Display the result on console.

import java.util.Scanner;
class MultiplyDivide{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter First Number");
        float number1 = scanner.nextFloat();

        System.out.println("Enter Second Number");
        float number2 = scanner.nextFloat();

        System.out.println("Multiplication = "+(number1*number2));

        System.out.println("Division = "+(number1/number2));


    }
}