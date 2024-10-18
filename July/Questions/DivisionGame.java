// Ravi and Shyam were playing a game. In the first turn of the game, 
// Ravi will give an integer dividend and an integer divisor to Shyam. 
// Then Shyam has to tell him the remainder of the division. In the second turn, 
// Shyam will repeat the procedure.
// To help them, please write a program that accepts Dividend, 
// and Divisor from the user and print the remainder on the console.


import java.util.Scanner;
class DivisionGame{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer Divident Ravi:");
        int Divident1 =scanner.nextInt();

        System.out.println("Enter an integer Divisor Ravi");
        int Divisor1 = scanner.nextInt();

        System.out.println("Remainder from Shyam = "+(Divident1%Divisor1));

        System.out.println("Enter an integer Divident Shyam:");
        int Divident2 =scanner.nextInt();

        System.out.println("Enter an integer Divisor Shyam");
        int Divisor2 = scanner.nextInt();

        System.out.println("Remainder from Ravi = "+(Divident2%Divisor2));

    }
}