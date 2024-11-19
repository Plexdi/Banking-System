public class Users {
    private int id;
    private String username;
    private String password;
    private double amount;

    //constructor 
    public Users(int id, String username, String password, double amount ){
        this.id = id;
        this.username = username; 
        this.password = password;
        this.amount = amount;
    }

    public int getId(){
        return id;
    }

    public String getUsername(){
        return username;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public double getAmount(){
        return amount;
    }

    public void setAmount(double amount){
        this.amount = amount;
    }
}
