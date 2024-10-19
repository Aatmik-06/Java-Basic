// 7.	If you know the balance and the annual percentage interest rate,
//  you can compute the interest on the next monthly payment using the following formula:
// interest = balance x (annualInterestRate/1200)
// Write a program that reads the balance and the annual percentage 
// interest rate and displays the interest for the next month.

import java.util.Scanner;
class Interest{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Balance:");
        double Balance = scanner.nextDouble();

        System.out.println("Enter annual percentage interest rate:");
        double Interest = scanner.nextDouble();

        System.out.println("Interest = "+(Balance*(Interest/1200)));
    }
}

