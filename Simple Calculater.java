//Making a simple calculator in Java...

import java.util.*;

class Calculator{
    public static void main(String [ ]args){
        // first we have to take the input from the user ... and for that we have to use the Scanner Class.
        System.out.print("\n\n\t\t\t\t\twelcome to the Calculator\n\n");

        System.out.print("\t\tENTER THE FIRST NUMBER  : ");
        Scanner cal = new Scanner(System.in);
        int a = cal.nextInt();
        System.out.print("\t\tENTER THE SECOND NUMBER : ");
        int b = cal.nextInt();
        System.out.print("\n\n\t\tchoose the operator in which u have to perform the operation\n\n");
        System.out.print("\tenter '+' for addition\n\n\tenter '-' for substraction\n\n\tenter '*' for multipication\n\n\tenter '/' for division\n\n\tenter '%' for modulus\n\n");
        System.out.print("\t\tENTER THE OPERATOR  : ");
        String op = cal.next();
        cal.close();
      
        // now  we have to use the switch case for the user requirement....
       
        
       switch(op){
        case "+" : System.out.print("\n\n\t\t\tTHE ADDITION IS : "+(a+b)+"\n\n\n");
        break;
        case "-" : System.out.print("\n\n\t\t\tTHE SUBSTRACTION  IS : "+(a-b)+"\n\n\n");
        break;
        case "*" : System.out.print("\n\n\t\t\tTHE SUBSTRACTION  IS : "+(a*b)+"\n\n\n");
        break;
        case "/" : System.out.print("\n\n\t\t\tTHE SUBSTRACTION  IS : "+(a/b)+"\n\n\n");
        break;
        case "%" : System.out.print("\n\n\t\t\tTHE SUBSTRACTION  IS : "+(a%b)+"\n\n\n");
        break;
        default : System.out.print("\n\n\t\t\tinvalid operator");
       }

       System.out.print("\t\t\tthank u for using the calculator...\n\n");

        

        
    }
}