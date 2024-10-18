// using java library 
// taking input
// using lang library inside lang there is a class scanner we are going to use 
// so we have to write import statement or by using the fully qualified class name of the java class scanner calss fully qualified name is java.util.Scanner
// import statement is written before class declaration 


// import Fully qualified name of class 
// import is a keyword 


// how to read user input
// 1.by creating object of scanner class 
// by declaring refrence and then initilizing it 
// ClassName object = new ClassName(System.in);    // new is a keyword which creates memory // System.in is source from where input is coming 
// 2. to read specific input or a type of input like integer so we have to use methods of Scanner class 
// if want to read integer = nextInt();
// double = nextDouble();
// short = nextShort();
// long = nextLong();
// byte = nextByte();
// float = nextFloat();
// boolean = nextBoolean();
// how to use these method 
//  by calling them using object
// generalize method call 
// ObjectName.methodName();

import java.util.Scanner;
class UserInput{
    public static void main(String[] args){
      // create Scanner class object

      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter any integer");

      int number1 = scanner.nextInt();
      System.out.println("Enter Temperature");

      float temperature = scanner.nextFloat(); 
      System.out.println("Enter True or false");

      boolean isAvailable = scanner.nextBoolean();
      System.out.println(isAvailable);

    }
}







