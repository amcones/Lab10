public class TestAccount {
    public static void main(String[] args) {
        Person p = new Person("George");
        //创建一个储蓄账户account1
        SavingsAccount account1 = new SavingsAccount(p.getName(), 1122, 1000);
        SavingsAccount.setAnnualInterestRate(5.5);
        //创建一个和account1相同id的储蓄账户
        SavingsAccount account2 = new SavingsAccount(p.getName(), 1122, 1000);
        //创建一个信用卡账户account3
        CheckingAccount account3 = new CheckingAccount(p.getName(), 2233, 0, 20000);
        //加入account1
        p.addAccount(account1);
        //一个人不能拥有相同的id的账户，account2不能加入成功
        p.addAccount(account2);
        //加入account3
        p.addAccount(account3);
        //在Person类中定printAllAccounts方法并补充完整
        p.printAllAccounts();

        account1.deposit(30);
        account1.deposit(40);
        account1.deposit(50);

        account1.withdraw(5);
        account1.withdraw(4);
        account1.withdraw(2);
        //在测试类中定义printAllTrans方法，并补充完整
        printAllTrans(account1);

        account3.withdraw(3000);
        account3.withdraw(4000);
        account3.withdraw(5000);
        //信用卡账户不能全部取出，这句话会输出”余额不足，无法取款”
        account3.withdraw(8000);
        printAllTrans(account3);

    }

    public static void printAllTrans(Account a) {
        //补充代码
        System.out.println("Date                               AccountID       Type        Amount         Balance ");
        for(Tran i : a.getTrans()){
            System.out.println(i.toString());
        }
    }
}