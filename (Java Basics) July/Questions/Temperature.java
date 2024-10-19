// 5.	Write a program that reads a Celsius degree in a double value from the console, then converts it to Fahrenheit and displays the result.
// The formula for the conversion is as follows: fahrenheit = (9 / 5) * celsius + 32
// Hint: In Java, 9 / 5 is 1, but 9.0 / 5 is 1.8.

import java.util.Scanner;
class Temperature{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Temperature in Celsius");
        double celsius = scanner.nextDouble();

        System.out.println("Temperature in Fahrenheit = "+(9.0/5*(celsius+32)));
    }
}

