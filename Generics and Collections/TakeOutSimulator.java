import java.util.Scanner;

// Create TakeOutSimulator class here
public class TakeOutSimulator {
    private Customer customer;
    private FoodMenu menu = new FoodMenu();
    private Scanner input = new Scanner(System.in);

    public TakeOutSimulator(){
        System.out.print("\nWhat is your name? ");
        String name = input.next();
        System.out.print("\nHow much money do you have? ");
        int money = input.nextInt();
        customer = new Customer(name, money);
    }

    private <T> getOutputOnIntInput(String userInputPrompt, IntUserInputRetriever intUserInputRetriever ){
        System.out.println("User selected-> "+userInputPrompt);
        try{
            intUserInputRetriever.produceOutputOnIntUserInput(userInputPrompt);
        }
        catch (IllegalArgumentException e){

        }
        return T;
    }


}
