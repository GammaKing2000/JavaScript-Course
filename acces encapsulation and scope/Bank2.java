class CheckingAccount2{
    private String name;
    private int balance;
    private String id;
    private double interestRate;

    public CheckingAccount2(String inputName, int inputBalance, String inputId){
        this.name = inputName;
        this.balance = inputBalance;
        this.id = inputId;
        this.interestRate = 0.02;
    }

    public void getAccountInformation(){
        System.out.println("Money in account: " + this.getBalance());
        System.out.println("Next Month's Interest: " + this.calculateNextMonthInterest());

    }

    private int getBalance(){
        return this.balance;
    }

    private double calculateNextMonthInterest(){
        return this.balance * this.interestRate;
    }

}

public class Bank2{
    private CheckingAccount2 accountOne;
    private CheckingAccount2 accountTwo;

    public Bank2(){
        this.accountOne = new CheckingAccount2("Zeus", 100, "1");
        this.accountTwo = new CheckingAccount2("Hades", 200, "2");
    }

    public static void main(String[] args){
        Bank2 bankOfGods = new Bank2();
        bankOfGods.accountOne.getAccountInformation();
    }

}