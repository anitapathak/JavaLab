package interfaces;

import java.util.Scanner;

public class child implements studentdetails {

    @Override
    public Student getUserValue(){
        Scanner Sc = new Scanner(System.in);
        Student S=new Student();

        System.out.println("enter the age ");
        S.age= Sc.nextInt();
        System.out.println("enter the name :");
        S.name=Sc.next();
        System.out.println("enter address:");
        S.address=Sc.next();
        return S;
    }
    @Override
    public void displayUserValue(Student S){
        System.out.println("name= " + S.name + " age=  " + S.age + " addreess = " + S.address);
    
    }


}
