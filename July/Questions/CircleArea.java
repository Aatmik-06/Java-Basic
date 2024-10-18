// 3.	Write a program to accept radius of circle from user. And calculate area and perimeter of circle. Display the result on console. 

import java.util.Scanner;
class CircleArea{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Radius of Circle");

        float Radius = scanner.nextFloat();

        System.out.println("Area = "+(2.14*Radius*Radius));

        System.out.println("Perimeter = "+(2*2.14*Radius)); 
    }
}
