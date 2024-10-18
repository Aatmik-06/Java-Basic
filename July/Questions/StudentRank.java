// WAP to accept rank, rollNo, totalMarks, and percentage form user and print them on console.

import java.util.Scanner;
class StudentRank{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Your Rank");
        int rank = scanner.nextInt();

        System.out.println("Enter Your Roll no");
        int rollno = scanner.nextInt();

        System.out.println("Enter Your Total Marks");
        int TotalMarks = scanner.nextInt();

        System.out.println("Enter Your Percentage");
        int percentage = scanner.nextInt();

        System.out.println();
        System.out.println("RanK="+rank);
        System.out.println("Roll no="+rollno);
        System.out.println("Total Marks"+TotalMarks);
        System.out.println("Percentage="+percentage);

    }
}
