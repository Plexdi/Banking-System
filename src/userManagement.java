import java.util.List;

public class userManagement {
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

    public void Deposit(int id, String username, double amount){
        for (Users eachUsers : user){
            if (id == eachUsers.getId()){
                double userMoney = (eachUsers.getAmount() + amount);
                eachUsers.setAmount(amount);
            }
        }
    }    

    
}

