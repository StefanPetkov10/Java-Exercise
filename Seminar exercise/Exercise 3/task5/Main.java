package task5;

public class Main {
    public static void main(String[] args) {
        RoomBookingSystem.processRoomReservations();

        System.out.println("Single Rooms:");
        for (SingleRoom room : RoomBookingSystem.singleRooms) {
            System.out.println("Room " + room.getRoomNumber() + ": " + room.getPricePerNight() + " per night");
        }

        System.out.println("\nSuite Rooms:");
        for (SuiteRoom room : RoomBookingSystem.suiteRooms) {
            System.out.println("Room " + room.getRoomNumber() + ": " + room.getPricePerNight() + " per night");
        }
    }
}