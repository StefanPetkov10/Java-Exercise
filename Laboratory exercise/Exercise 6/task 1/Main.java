package task1;

public class Main {
    public static void main(String[] args) {
        Train train = new Train();
        train.addWagon("Passenger wagon");
        train.addWagon("Cargo wagon");
        train.addWagon("Passenger wagon");

        train.removeLastWagon();
        train.removeLastWagon();

        train.printTrain();
    }
}
