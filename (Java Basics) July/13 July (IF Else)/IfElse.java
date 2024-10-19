
// WAP to ask user to enter the withdrawal amount
// if withdrawal amount is less then balance so message withdrawal permitted and always print tysm
import java.util.Scanner;
class IfElse{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Amount to Withdraw");
        double Amount = scanner.nextDouble();
        int balance = 100000;
        if(Amount<=balance){
            System.out.println("Withdrawal permitted");
        }else{
        System.out.println("insuficient balance");
             }
        System.out.println("Tysm");

    }
}

// syntax 
// condition is a boolean expression
// if(Condition){     

// }else{

// }

