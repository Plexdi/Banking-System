import java.util.List;

public class UserManagement {
    private List<Users> user;

    public void CreateAccount(String username, String password){
        int id = 0;
        double amount = 0.00;
        //check if username exists 
        for (Users users : user){
            if (username.equals(users.getUsername())){
                System.out.println("Username already exists, please try again");
                return;
            } 
        }
        //check password strength 
        if (password.length() <= 8){
            System.out.println("Password must be at least 8 characters long, please try again ");
            return;
        }

        id +=1;
        Users newUser = new Users(id, username, password, amount);
        System.out.println("User " + username + " has added successfully!");
    }

    public void Login(String username, String password){
        for (Users eachUsers : user){
            if (username.equals(eachUsers.getUsername())){
                if (password.equals(eachUsers.getPassword())){
                    System.out.println("Login successful!");
                }
            } else{
                System.out.println("invalid credential");
                return;
            }
        }
    }

    public void Deposit(int id, String username, double amount){
        for (Users eachUsers : user){
            if (id == eachUsers.getId()){
                double newMoney = (eachUsers.getAmount() + amount);
                eachUsers.setAmount(newMoney);
            }
        }
    }    
    
    public void Withdraw(int id, String username, double amount){
        for (Users eachUsers : user){
            if (id == eachUsers.getId()){
                double userMoney = eachUsers.getAmount();
                if (userMoney < amount){
                    System.out.println("You do not have money to.");
                } else{
                    double newUserAmount = (eachUsers.getAmount() - amount);
                    eachUsers.setAmount(newUserAmount);
                }
            }
        }
    }    
}

