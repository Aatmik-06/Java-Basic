// if elseif 
// if else if else 
// find greatest of three number
// and taking input from args without scanner
class IfElseIf{
    public static void main(String[] args){   // public is accesible for main method and static 
        //to run thiscode type java GreatestOfThreeNumbers 100 300 20
        // 100 300 20 are the arguments, coming to 0,1,2 index of args array
        // this code is show the use of String[] args
        int number1 = Integer.parseInt(args[0]);//using Integer.parseInt() method to parse(convert) String to integer
        int number2 = Integer.parseInt(args[1]);
        int number3 = Integer.parseInt(args[2]);

        if(number1 > number2){
            if(number1 > number3) {
                System.out.println("NUmber 1 = " + number1 + " is Greatest");
            }else{
                System.out.println("NUmber 3 = " + number3 + " is Greatest");
            }
        }else if(number2 > number3 ){
                System.out.println("NUmber 2 = " + number2 + " is Greatest");
        }else{
            System.out.println("NUmber 3 = " + number3 + " is Greatest");
        }
        
    }
}
        
        
// nested if else but good progrmming says that we can use 3 if else in nesting 

