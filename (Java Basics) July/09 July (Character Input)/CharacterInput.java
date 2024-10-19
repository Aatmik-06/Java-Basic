// Taking character input so input will be in string 

import java.util.Scanner;
class CharacterInput{
    public static void main(String[] args){
        System.out.println("Enter your section");
        Scanner scanner = new Scanner(System.in);
        // using charAt(int index) method
        // to get the character from
        // given index 
        char section = scanner.next().charAt(0);
        System.out.println("Section=" + section);
        
    }

      
}