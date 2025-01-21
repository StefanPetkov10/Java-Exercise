package task5;

public abstract class Room {
    private int roomNumber;
    private String roomType;
    private double pricePerNight;
    private int availableNights;

    public Room(int roomNumber, String roomType, double pricePerNight, int availableNights) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.pricePerNight = pricePerNight;
        this.availableNights = availableNights;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public String getRoomType() {
        return roomType;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    public int getAvailableNights() {
        return availableNights;
    }

    public boolean reserveRoom(int numNights) throws NoAvailableNightsException {
        if (numNights > availableNights) {
            throw new NoAvailableNightsException("Not enough nights available for room " + roomNumber);
        }
        availableNights -= numNights;
        return true;
    }
}