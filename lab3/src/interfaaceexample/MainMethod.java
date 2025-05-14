package interfaaceexample;

import java.util.Scanner;

public class MainMethod {
public static void main(String[] args) {
    Scanner S= new Scanner(System.in);
    funcdefination F=new funcdefination();
    int num1,num2;
    String ch ,a;
    do{
        System.out.println("enter the value of first number :");
        num1=S.nextInt();
    System.out.println("enter the value of second number :");
     num2=S.nextInt();
    System.out.println("enter the opertor (+,-,*,/)");
     ch=S.next();
    switch (ch) {
        case "+":
            F.add(num1, num2);
            break;
        case "-":
        F.subtract(num1, num2);
        break;
        case "*":
        F.multiple(num1, num2);
        break;
        case "/":
        F.divide(num1, num2);
        break;

        default:
        System.out.println("Invalid entry");
            break;
    }
    System.out.println("Do you want to continue(y/n)");
     a=S.next();
}
    while (a.equalsIgnoreCase("y")); 
    
}}

