package task3;


public class Main {
    public static void main(String[] args) {

        BusRoute busRoute = new BusRoute();

        busRoute.addStop("Stop 1");
        busRoute.addStop("Stop 2");
        busRoute.addStop("Stop 3");

        busRoute.removeStop();
        busRoute.removeStop();

        busRoute.printRoute();
    }

}
