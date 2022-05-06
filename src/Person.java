import java.util.ArrayList;

public class Person {
    private String name;
    private ArrayList<Account> accountList;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(String name) {
        setName(name);
        accountList= new ArrayList<>();
    }
    public void addAccount(Account account){
        for(Account i : accountList){
            if(i.equals(account))return;
        }
        accountList.add(account);
    }
    public void printAllAccounts()
    {
        System.out.println(getName()+" has "+accountList.size()+" accounts:");
        for(Account i : accountList){
            System.out.println(i.toString());
        }
    }

}
