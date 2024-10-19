// Write a program that prompts the user to enter the speed of a vehicle. If speed is less than 20,
//  display too slow; if speed is greater than 80, display too fast; but alwyas display drive safe.

import java.util.Scanner;
class VehicleSpeed{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Speed of Vehicle");
        int Speed = scanner.nextInt();
        if(Speed<20){
            System.out.println("TOO SLOW");
        }else if(Speed>80){
            System.out.println("TOO FAST");
        }
        System.out.println("DRIVE SAFE");

    }
}
