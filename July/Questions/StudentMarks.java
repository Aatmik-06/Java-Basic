// WAP to accpect marks of 5 subjects form user and print them on console.

import java.util.Scanner;
class StudentMarks{
    public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Enter your physics marks");
    int PhysicsMarks = scanner.nextInt();
    
    System.out.println("Enter your Chemistry marks");
    int ChemistryMarks = scanner.nextInt();

    System.out.println("Enter your Maths marks");
    int MathsMarks = scanner.nextInt();

    System.out.println("Enter your Hindi marks");
    int HindiMarks = scanner.nextInt();

    System.out.println("Enter your English marks");
    int EnglishMarks = scanner.nextInt();

    System.out.println("Physics Marks="+PhysicsMarks);
    System.out.println("Chemistry Marks="+ChemistryMarks);
    System.out.println("Maths Marks="+MathsMarks);
    System.out.println("Hindi Marks="+HindiMarks);
     System.out.println("English Marks="+EnglishMarks);

    }
}