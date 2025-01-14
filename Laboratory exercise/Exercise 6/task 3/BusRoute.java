package task3;

import java.util.LinkedList;
import java.util.Queue;

public class BusRoute {
    private Queue<String> busStops;

    public BusRoute() {
        this.busStops = new LinkedList<>();
    }

    public void addStop(String stop) {
        busStops.add(stop);
        System.out.println("Stop added: " + stop);
    }

    public void removeStop() {
        if (busStops.isEmpty()) {
            System.out.println("No stops to remove");
        } else {
            System.out.println("Stop removed: " + busStops.poll());
        }
    }

    public void printRoute() {
        if (!busStops.isEmpty()) {
            for (String stop : busStops) {
                System.out.println(stop);
            }
        } else {
            System.out.println("Route is empty");
        }
    }
}
