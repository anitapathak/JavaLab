package inheritence;

public class GeneralManager extends Manager {
    public void displayGeneralManager(int i, String s) {
        id = i;
        name = s;
        System.out.println("General Manager Details:");
        System.out.println("Name = " + name);
        System.out.println("ID = " + id);
    }
}

