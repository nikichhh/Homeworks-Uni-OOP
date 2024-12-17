package bg.tu_varna.sit.b2.f23621689.homework9.task1;

public class Hotel {
    private Room[] rooms;
    private int roomCount;

    public Hotel(int capacity) {
        this.rooms = new Room[capacity];
        this.roomCount = 0;
    }

    public void addRoom(Room room) {
        if (roomCount < rooms.length) {
            rooms[roomCount++] = room;
        }
    }

    public boolean createReservation() {
        for (int i = 0; i < roomCount; i++) {
            if (rooms[i].isAvailable()) {
                rooms[i].setAvailable(false);
                return true;
            }
        }
        return false;
    }

    public double calculateBookedRoomsDiscount() {
        double discountSum = 0;
        for (int i = 0; i < roomCount; i++) {
            if (!rooms[i].isAvailable()) {
                discountSum += rooms[i].calculateStayPrice() - rooms[i].calculateReservationPrice();
            }
        }
        return discountSum;
    }

    public double calculateAveragePriceOfAvailableRoomsWithSeaView() {
        double totalPrice = 0;
        int count = 0;
        for (int i = 0; i < roomCount; i++) {
            if (rooms[i].isAvailable() && rooms[i].getExposure() == Exposure.SEA_VIEW) {
                totalPrice += rooms[i].getPricePerDay();
                count++;
            }
        }
        return count > 0 ? totalPrice / count : 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < roomCount; i++) {
            sb.append(rooms[i].toString()).append("\n");
        }
        return sb.toString();
    }
}
