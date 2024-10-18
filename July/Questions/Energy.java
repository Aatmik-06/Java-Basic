// 6.	Write a program that calculates the energy needed to heat water from an 
// initial temperature to a final temperature. Your program should prompt the user
//  to enter the amount of water in kilograms and the initial and final temperatures of the water.
// The formula to compute the energy is Q = M * (finalTemperature – initialTemperature) * 4184
// where M is the weight of water in kilograms temperatures 
// are in degrees Celsius, and energy Q is measured in joules.
// Here is a sample run:

import java.util.Scanner;
class Energy{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the amount of water in kilograms:");
        double WaterAmount = scanner.nextDouble();

        System.out.println("Enter Initial Temperature:");
        double InitialTemp = scanner.nextDouble();
        
        System.out.println("Enter Final Temperature:");
        double FinalTemp = scanner.nextDouble();

        System.out.println("Energy = "+ (WaterAmount*(FinalTemp-InitialTemp)*4184));
        
    }
}