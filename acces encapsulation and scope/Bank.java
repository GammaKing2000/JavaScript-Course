class CheckingAccount{
    public String name;
    private int balance;
    private String id;

    public CheckingAccount(String inputName, int inputBalance, String inputId){
        name = inputName;
        balance = inputBalance;
        id = inputId;
    }

    public void addFunds(int fundsToAdd){
        balance += fundsToAdd;
    }

    public void getInfo(){
        System.out.println("This checking account belongs to " + name +". It has " + balance + " dollars in it.");
    }

}

public class Bank{
    private CheckingAccount accountOne;
    private CheckingAccount accountTwo;

    public Bank(){
        accountOne = new CheckingAccount("Zeus", 100, "1");
        accountTwo = new CheckingAccount("Hades", 200, "2");
    }

    public static void main(String[] args){
        Bank bankOfGods = new Bank();
        System.out.println(bankOfGods.accountOne.name);
        bankOfGods.accountOne.addFunds(5);
        bankOfGods.accountOne.getInfo();

    }

}