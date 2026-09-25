public class user {
    private String userName;
    private double insertAmount;
    private double balance;

    public user(String userName, double insertAmount, double balance) {
        this.userName = userName;
        this.insertAmount = insertAmount;
        this.balance = balance;
    }

    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public double getInsertAmount() {
        return insertAmount;
    }
    public void setInsertAmount(double insertAmount) {
        this.insertAmount = insertAmount;
    }

    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void topUP(double amount){
        this.balance += amount;
        this.insertAmount += amount;
    }

    public void topUp(double amount){
        topUP(amount);
    }

    public boolean checkPay(double amount){
        return balance >= amount;
    }

    public boolean canPay(double amount){
        return checkPay(amount);
    }

    public void pay(double amount){
        this.balance -= amount;
    }
}
