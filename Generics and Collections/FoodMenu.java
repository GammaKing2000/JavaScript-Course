import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FoodMenu {
    private List<Food> menu = new ArrayList<Food>();

    public FoodMenu(){
        menu.add(new Food("Tacos", "Yummy steak tacos", 15));
        menu.add(new Food("Dumplings", "Delicious steamed", 10));
        menu.add(new Food("Ramen", "Hot pork ramen", 12));
    }

    public String toString(){
        int counter =1;
        for(Food i : menu){
            i.toString();
        }
        return null;
    }

    public Food getFood(){
        System.out.print("\nWhat do you want to eat? ");
        Scanner sc = new Scanner(System.in);
        int selection = sc.nextInt();
        return menu.get(selection);
    }
}
