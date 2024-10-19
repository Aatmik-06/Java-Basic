// increment and decrement 
// compound assignment operator
class IncrementDecre{
    public static void main(String[] args){
        int num1= 5;
        float float1= 5.5f;
        num1++;
        int num2=num1;
        System.out.println(num2);
        System.out.println(float1);
    }
}


//increment and decrement
// compound assignment operator
/*
++ -> increment
-- -> decrement
int num = 5;
num++; postfix
num--;


++num; prefix
--num; prefix a++ + ++a
*/
class ArithimaticOperator{
    public static void main(String[] args){
        int num = 5;
        num--;
        int num2 = num;

        double temp = 9.9;
        temp++;
        char tempChar = '0';

        //tempChar++;
        int smallA = 320;

        int tempMod = smallA % 127;
        System.out.println("Num = " + num);
        System.out.println("Num 2 = " + num2);
        System.out.println("temp = " + temp);
        System.out.println("Temp char = " + (int)tempChar);
        System.out.println("smallA = " + (char)smallA);
        System.out.println("tempMod = " + tempMod);
    }
}