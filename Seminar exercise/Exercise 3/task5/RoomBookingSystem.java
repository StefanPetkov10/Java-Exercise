package task5;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class RoomBookingSystem {
    public static SingleRoom[] singleRooms;
    public static SuiteRoom[] suiteRooms;

    public static void processRoomReservations() {
        RoomLoader loader = new RoomLoader("rooms.txt");
        List<Room> rooms = new ArrayList<>();

        try {
            loader.updateAvailabilityFromFile();

            List<SingleRoom> singleRoomList = new ArrayList<>();
            List<SuiteRoom> suiteRoomList = new ArrayList<>();

            for (Room room : rooms) {
                if (room instanceof SingleRoom) {
                    singleRoomList.add((SingleRoom) room);
                } else if (room instanceof SuiteRoom) {
                    suiteRoomList.add((SuiteRoom) room);
                }
            }

            singleRooms = singleRoomList.toArray(new SingleRoom[0]);
            suiteRooms = suiteRoomList.toArray(new SuiteRoom[0]);

            System.out.println("Rooms successfully loaded and categorized.");
        } catch (IOException e) {
            System.err.println("Error processing reservations: " + e.getMessage());
        }
    }
}