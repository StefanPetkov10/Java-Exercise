package task5;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class RoomLoader implements Reservable {
    private String fileName;

    public RoomLoader(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void updateAvailabilityFromFile() throws IOException {
        List<Room> rooms = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split("\\*");
                if (data.length != 5) {
                    throw new InvalidRoomDataException("Invalid room data: " + line);
                }

                int roomTypeCode = Integer.parseInt(data[0]);
                int roomNumber = Integer.parseInt(data[1]);
                String roomType = data[2];
                double pricePerNight = Double.parseDouble(data[3]);
                int availableNights = Integer.parseInt(data[4]);

                if (roomTypeCode == 1) {
                    rooms.add(new SingleRoom(roomNumber, pricePerNight, availableNights, "Standard"));
                } else if (roomTypeCode == 2) {
                    rooms.add(new SuiteRoom(roomNumber, pricePerNight, availableNights, 2));
                } else {
                    throw new InvalidRoomDataException("Unknown room type: " + roomTypeCode);
                }
            }
        } catch (IOException | NumberFormatException | InvalidRoomDataException e) {
            throw new IOException("Error processing room file: " + e.getMessage());
        }
    }
}