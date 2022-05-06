import java.util.Date;

public class Tran {
    private Date date;
    private int accountID;
    private char type;
    private double amount;
    private double balance;

    public Tran(Date date,int accountID,char type,double amount,double balance)
    {
        setDate(date);
        setAccountID(accountID);
        setType(type);
        setAmount(amount);
        setBalance(balance);
    }

    public double getBalance() {
        return balance;
    }

    public char getType() {
        return type;
    }

    public Date getDate() {
        return date;
    }

    public double getAmount() {
        return amount;
    }

    public int getAccountID() {
        return accountID;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setType(char type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return date+"          "+
                accountID+"           "+
                type+"          "+
                amount+"          "+
                balance;
    }
}
