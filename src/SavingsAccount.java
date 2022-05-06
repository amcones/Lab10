import java.util.Date;

public class SavingsAccount extends Account{
    private static double annualInterestRate;

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public static void setAnnualInterestRate(double setannualInterestRate) {
        annualInterestRate = setannualInterestRate;
    }

    public SavingsAccount(String name,int id,double balance)
    {
        this.setName(name);
        this.setId(id);
        this.setBalance(balance);
        this.setDateCreated(new Date());
    }

    public double getMonthInterest(double annualInterestRate)
    {
        return annualInterestRate/12/100*getBalance();
    }

    @Override
    public String toString() {
        return "SavingsAccount[" +
                "MonthlyInterest=" + getMonthInterest(getAnnualInterestRate()) + "," +
                "Id=" + getId() + "," +
                "Balance=" + getBalance() + "," +
                "Name=" + getName() + "," +
                "DataCreated=" + getDateCreated() +
                ']';
    }
}
