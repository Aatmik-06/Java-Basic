// Algorithm is steps to solve a given pattern
// WAP to accept two numbers from user and print them on console 

// for taking user input we will use library
// class Scanner which is coming from package 
// java.util
// to add this class in our program ,we will use import 
// statement. import statements are placed above class 
// Declaration 

// import java.util.* is used to include all the classes 

import java.util.Scanner;
class UserInputOutput{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Name");
        // next() will read only alphabets so it will not read space 
        // nextLine will read till line terminator and enter is also line terminator 
        String name = scanner.next();
        System.out.println("Name=" + name);
        String name1 = scanner.nextLine();
        System.out.println("Name=" + name1);


        // when u read a numeric value using scanner and then you want to read a string value by using nextline then it will not work 


    }
}
