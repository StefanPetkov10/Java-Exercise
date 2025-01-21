package task5;

public class SuiteRoom extends Room {
    private int numberOfRooms;

    public SuiteRoom(int roomNumber, double pricePerNight, int availableNights, int numberOfRooms) {
        super(roomNumber, "Suite", pricePerNight, availableNights);
        this.numberOfRooms = numberOfRooms;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }
}
