// Write a program that prompts the user to enter the total_bil_amount. 
// If bill amount greater than or equal to 2000, calculate and print the final_bill_amount by 
// giving 10 percent discount. If bill amount is less than 2000 then print No Discount.

import java.util.Scanner;
class TotalBill{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Total Bill Amount");
        int Bill = scanner.nextInt();
        if(Bill>=2000){
            int Discount=Bill-Bill/100*10;
            System.out.println("Discounted Bill = "+Discount);
        }else{
            System.out.println("No Discount");
        }
    }
}