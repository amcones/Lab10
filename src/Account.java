import java.util.ArrayList;
import java.util.Date;

//账户的基类
public class Account {
    private String name;
    private int id;
    private double balance;
    private Date DateCreated;
    private ArrayList<Tran> trans;

    public Account() {
        setTrans(new ArrayList<>());
    }

    public ArrayList<Tran> getTrans() {
        return trans;
    }

    public void setTrans(ArrayList<Tran> trans) {
        this.trans = trans;
    }

    public String getName() {
        return name;
    }

    public Date getDateCreated() {
        return DateCreated;
    }

    public double getBalance() {
        return balance;
    }

    public int getId() {
        return id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDateCreated(Date dateCreated) {
        DateCreated = dateCreated;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void deposit(double cnt)
    {
        setBalance(getBalance()+cnt);
        trans.add(new Tran(new Date(),getId(),'D',cnt,getBalance()));
    }
    public void withdraw(double cnt)
    {
        if(cnt>getBalance()){
            System.out.println("余额不足，无法取款");
            return;
        }
        setBalance(getBalance()-cnt);
        trans.add(new Tran(new Date(),getId(),'W',cnt,getBalance()));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Account account = (Account) o;

        return id == account.id;
    }
}
