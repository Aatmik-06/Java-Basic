// 4.	Write a program to accept length and breadth of rectangle from user. And calculate area and perimeter of rectangle. Display the result on console.

import java.util.Scanner;
class RectangleArea{
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter length of rectangle ");
        int length = scanner.nextInt();

        System.out.println("Enter breadth of rectangle ");
        int breadth = scanner.nextInt();

        System.out.println("Area = "+(length*breadth));

        System.out.println("perimeter = "+(2*(length+breadth)));

    }
}