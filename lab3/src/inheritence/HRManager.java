package inheritence;

public class HRManager extends Manager {
    public void displayHRManager(int i, String s) {
        id = i;
        name = s;
        System.out.println("HR Manager Details:");
        System.out.println("Name = " + name);
        System.out.println("ID = " + id);
    }
}
