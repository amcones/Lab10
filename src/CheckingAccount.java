import java.util.Date;

public class CheckingAccount extends Account{
    private double creditAmount;

    public double getCreditAmount() {
        return creditAmount;
    }

    public void setCreditAmount(double creditAmount) {
        this.creditAmount = creditAmount;
    }

    public CheckingAccount(String name,int id,double balance,double creditAmount)
    {
        this.setName(name);
        this.setId(id);
        this.setBalance(balance);
        this.setCreditAmount(creditAmount);
        this.setDateCreated(new Date());
    }

    @Override
    public String toString() {
        return "CheckingAccount[" +
                "creditAmount=" + getCreditAmount() + ',' +
                "Id=" + getId() + ',' +
                "Balance=" + getBalance() + ',' +
                "Name=" + getName() + ',' +
                "DateCreated=" + getDateCreated() +
                ']';
    }
    @Override
    public void withdraw(double cnt)
    {
        if(cnt>=getBalance()+getCreditAmount()){
            System.out.println("余额不足，无法取款");
            return;
        }
        setBalance(getBalance()-cnt);
        getTrans().add(new Tran(new Date(),getId(),'W',cnt,getBalance()));
    }
}
