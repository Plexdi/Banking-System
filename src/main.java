
import java.util.Scanner;

public class main{
    public static void main(String[] args) {
        UserManagement userManagement = new UserManagement();
        boolean continues = true;
        do { 
            int id = 0;
            double amount = 0.00;
            Scanner scanner = new Scanner(System.in);
            System.out.println("1. Login \n2. Signup \n3. Quit");
            int options = scanner.nextInt();
            scanner.nextLine();
            
            switch (options) {
                case 1:
                    System.out.println("Username: ");
                    String username = scanner.nextLine();
                    System.out.println("Password: ");
                    String password = scanner.nextLine();
                    boolean validations = userManagement.Login(username, password);
                    if (validations == true){
                        System.out.println("1. Deposit \n2. Withdraw \n3. View balance ");
                    }
                    break;
                case 2:
                    if (options == 2) {
                        System.out.println("Enter a username: ");
                        String usernames = scanner.nextLine();       
                        System.out.println("Enter a password: ");
                        String passwords = scanner.nextLine();
                        boolean validation = userManagement.CreateAccount(usernames, passwords);
                        if (validation == true){
                            System.out.println("1. Deposit \n2. Withdraw \n3. View balance ");
                        }
                    }   break;
                default:
                    continues = false;
                    break;
            }
        } while (continues == true); 
        
    }
}