package inheritence;

public class Result extends Test {
protected float total_marks;
protected float percentage;
// public void calculate(){
//     total_marks=getMark1()+getMark2();
//     percentage=total_marks/2;

// }

 public void display(){
    total_marks=getMark1()+getMark2();
    percentage=total_marks/2;
System.out.println("the total marks is " + total_marks + "percentage is "+ percentage);
 }
}
