package inheritence;

public class mainclass {
public static void main(String[] args) {
    HRManager h1= new HRManager();
    GeneralManager g1=new GeneralManager();
    g1.displayGeneralManager(101,"anita");
    h1.displayHRManager(102, "apsara");
    g1.display();
    h1.display();
}
}
