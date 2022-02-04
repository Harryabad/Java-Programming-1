
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author harry
 */
public class Suitcase {

    private int maxWeight;
    private ArrayList<Item> items;

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        items = new ArrayList<>();

    }

    public void addItem(Item item) {

        int totalW = 0;
        for (Item i : items) {
            totalW += i.getWeight();
        }

        if ((item.getWeight() + totalW) <= this.maxWeight) {
            items.add(item);
        }
    }

    public void printItems() {

        for (Item i : items) {
            System.out.println(i);
        }
    }

    public int totalWeight() {

        int totalW = 0;
        for (Item i : items) {
            totalW += i.getWeight();
        }
        return totalW;

    }

    public Item heaviestItem() {

        Item heaviest = new Item("", 0);

        for (Item i : items) {
            if (i.getWeight() > heaviest.getWeight()) {

                heaviest = i;
            }
        }

        if (!(items.isEmpty())) {

            return heaviest;
        } else {
            return null;
        }

    }

    public String toString() {

        int totalW = 0;
        for (Item i : items) {
            totalW += i.getWeight();
        }

        if (items.size() > 1) {
            return items.size() + " items (" + totalW + " kg)";
        } else if (items.size() == 1) {
            return items.size() + " item (" + totalW + " kg)";
        } else {
            return "no items " + totalW + " kg)";
        }

    }

}
