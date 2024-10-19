// Write a program that reads three edges of a triangle and computes and display the area 
// if the input is valid. Otherwise, it displays that the input is invalid. The input is valid 
// if all the edges of the triangle are equal.Formula for calculating area:
// Area = 0.433012 * edge * edge

import java.util.Scanner;
class TriangleArea{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 3 Edges of Triangle");
        int Edge1 = scanner.nextInt();
        int Edge2 = scanner.nextInt();
        int Edge3 = scanner.nextInt();
        if(Edge1==Edge2&&Edge2==Edge3){
            System.out.println("Area of triangle = "+(0.433012*Edge1*Edge2));
        }else{
            System.out.println("Invalid input");
        }

        

        
    }
}