
import java.util.Scanner;

public class main{
    public static void main(String[] args) {
        UserManagement userManagement = new UserManagement();

        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Login \n 2.Signup");
        int options = scanner.nextInt();
        scanner.nextLine();

        if (options == 1){
            System.out.println("Username: ");
            String username = scanner.nextLine();
            System.out.println("Password: ");
            String password = scanner.nextLine();

            Users user = new Users(username, password);
            
        }
        
        
    }
}