// conditional statements 
        // if statement
        // if(Condition){
                  // block of code 
                  // Statements  
                    //   }
        // if is keyword 
        // condition is a expression that will resolve to boolean value 


// WAP to accept an number from user and check number is greater than 100 if greter print the number
//  this code will always print thankyou 
import java.util.Sacnner;
class ConditionalStatement{
    public static void main(String[] args){
     
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter any integer");
      int number = scanner.nextInt();
      if(number>100){

        System.out.println("Number = "+number);
      }
      System.out.println("Thankyou");

    }
}



