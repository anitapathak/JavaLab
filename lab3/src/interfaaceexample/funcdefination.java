package interfaaceexample;

public class funcdefination implements Calculator {
@Override
public void add(int a,int b){
System.out.println("sum is " + (a+b));
}
@Override
public void subtract(int a,int b){
    System.out.println("subtraction  is " + (a-b));
}
@Override
public void multiple(int a,int b){
    System.out.println("multiplication is " + (a*b));
}
@Override
public void divide(int a,int b){
    
    System.out.println("divide is is " + (a/b));
}
}
