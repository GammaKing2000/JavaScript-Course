import java.util.Scanner;

class ShopItems {
    int totalCount;

    class NonVegan{
        int iceCreamCount=0;
        int shakeCount=0;
        int totalCount;

        public void increaseCount(String s, int count){
            if(s.equals("ice cream")){
                iceCreamCount+=count;
                totalCount = shakeCount+iceCreamCount;
                ShopItems.this.totalCount+=shakeCount+iceCreamCount;
            }
            else if(s.equals("shake")){
                shakeCount+=count;
                totalCount = shakeCount+iceCreamCount;
                ShopItems.this.totalCount+=shakeCount+iceCreamCount;
            }
        }

    }
    class Vegan{
        int smoothieCount=0;
        int slushieCount=0;
        int totalCount;
        public void increaseCount(String s, int count){
            if(s.equals("smoothie")){
                smoothieCount+=count;
                totalCount = slushieCount+smoothieCount;
                ShopItems.this.totalCount+=slushieCount+smoothieCount;
            }
            else if(s.equals("slushie")){
                slushieCount+=count;
                totalCount = slushieCount+smoothieCount;
                ShopItems.this.totalCount+=slushieCount+smoothieCount;
            }
        }

    }

}

public class IceCreamShop {

    public static void main(String[] args) {
        int orderType = 0;
        Scanner input = new Scanner(System.in);
        int itemCount = 0;
        String itemName;
        ShopItems shopItems = new ShopItems();
        ShopItems.NonVegan nonVegan = shopItems.new NonVegan();
        ShopItems.Vegan vegan = shopItems.new Vegan();

        System.out.println("Hello! Welcome to the ice cream shop. We are ready to take your order. For ice-cream type 1, for shakes type 2, for smoothies type 3, and for slushies type 4. If you are done ordering type 0.");
        orderType = input.nextInt();

        while(orderType != 0) {
            System.out.println("How many items of this item would you like to order?");
            itemCount = input.nextInt();
            if(orderType == 1){
                itemName = "ice cream";
                nonVegan.increaseCount(itemName, itemCount);
            } else if(orderType == 2) {
                itemName = "shake";
                nonVegan.increaseCount(itemName, itemCount);
            } else if(orderType == 3) {
                itemName = "smoothie";
                vegan.increaseCount(itemName, itemCount);
            } else if(orderType == 4) {
                itemName = "slushie";
                vegan.increaseCount(itemName, itemCount);
            } else {
                break;
            }

            System.out.println("Adding " + itemCount + " of the item "+ itemName + " to your order!");

            System.out.println("Type a number for the next item in your order:\n1: Ice cream\n2: Shake\n3: Smoothie\n4: Slushie\n");
            orderType = input.nextInt();
        }
        System.out.println("Thank you for your order! Today we have sold "+shopItems.totalCount+" orders of sweetness!");
    }
}