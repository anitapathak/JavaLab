import java.sql.DriverManager;
import java.sql.SQLException;

public class eg {
    public static void main(String[] args) {
        
    try{
        DriverManager.getConnection("jbdc:mySql://localhost/3306/anita", "root", "");
        System.out.println("succesful connection:");
    }catch (SQLException ex){
        System.out.println("exception " + ex.getMessage());
    }

}}
