package task1;

import java.util.Stack;

public class Train {

    private Stack<String> wagons;

    public Train() {
        wagons = new Stack<>();
    }

    public void addWagon(String wagon) {
        wagons.push(wagon);
        System.out.println("Wagon added: " + wagon);
    }

    public void removeLastWagon() {
        if (wagons.isEmpty()) {
            System.out.println("No wagons to remove");
        } else {
            System.out.println("Wagon removed: " + wagons.pop());
        }
    }

    public void printTrain() {
        if(!wagons.isEmpty()) {
            for (String wagon : wagons) {
                System.out.println(wagon);
            }
        } else {
            System.out.println("Train is empty");
        }
    }
}
