
import java.util.Scanner;

public class main{
    public static void main(String[] args) {
        UserManagement userManagement = new UserManagement();
        boolean continues = true;
        do { 
            int id = 0;
            double amount = 0.00;
            Scanner scanner = new Scanner(System.in);
            System.out.println("1. Login \n2. Signup");
            int options = scanner.nextInt();
            scanner.nextLine();
    
            switch (options) {
                case 1:
                    System.out.println("Username: ");
                    String username = scanner.nextLine();
                    System.out.println("Password: ");
                    String password = scanner.nextLine();
                    userManagement.Login(username, password);
                    break;
                case 2:
                    if (options == 2) {
                        System.out.println("Enter a username: ");
                        String usernames = scanner.nextLine();       
                        System.out.println("Enter a password: ");
                        String passwords = scanner.nextLine();
                        userManagement.CreateAccount(usernames, passwords);
                    }   break;
                default:
                    continues = false;
                    break;
            }
        } while (continues == true);
        
    }
}