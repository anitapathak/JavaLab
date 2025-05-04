package boardquestion;

public class Mainclass {
    public static void main(String[] args) {
        child c = new child();
        Student s = c.getUserValue();
        c.displayUserValue(s);
    }
}
