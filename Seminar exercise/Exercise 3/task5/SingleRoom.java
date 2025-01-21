package task5;

public class SingleRoom extends Room {
    private String bedCategory;

    public SingleRoom(int roomNumber, double pricePerNight, int availableNights, String bedCategory) {
        super(roomNumber, "Single", pricePerNight, availableNights);
        this.bedCategory = bedCategory;
    }

    public String getBedCategory() {
        return bedCategory;
    }
}


