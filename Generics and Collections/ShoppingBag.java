import java.util.HashMap;
import java.util.Map;

// Create ShoppingBag class here
public class ShoppingBag<T extends PricedItem<Integer>>{
    private Map<T, Integer> shoppingBag;
    public ShoppingBag() {
        shoppingBag = new HashMap<T, Integer>();
    }

    public void addItem(T item){
        if(shoppingBag.get(item)==null)
            shoppingBag.put(item, 1);
        else
            shoppingBag.put(item, shoppingBag.get(item)+1);
    }

    public int getTotalPrice(){
        int sum=0;
        for(Map.Entry<T, Integer> entry: shoppingBag.entrySet()){
            sum+= entry.getKey().getPrice()* entry.getValue();
        }
        return sum;
    }
}