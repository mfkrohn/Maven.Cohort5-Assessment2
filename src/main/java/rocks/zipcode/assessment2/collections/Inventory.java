package rocks.zipcode.assessment2.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * Use a map to keep track of inventory in a store
 */
public class Inventory {
    /**
     * @param strings list of strings to add / remove / fetch from
     */
    Map<String, Integer> inventoryMap = new TreeMap<>();
    public Inventory(List<String> strings) {
    for(String item:strings){
        inventoryMap.put(item,0);
    }
    }

    /**
     * nullary constructor initializes a new list
     */
    public Inventory() {


    }

    /**
     * @param item - increment the number of this item in stock by 1
     */
    public void addItemToInventory(String item) {



        inventoryMap.put(item, inventoryMap.getOrDefault(item,0)+1);


    }

    /**
     * @param item - decrement the number of this item in stock by 1
     */
    public void removeItemFromInventory(String item) {
        inventoryMap.put(item,inventoryMap.get(item)-1);


    }

    /**
     * @param item - Search for this item in stock
     * @return - return the number of items
     */
    public Integer getItemQuantity(String item) {
        return inventoryMap.getOrDefault(item,0);
    }
}
