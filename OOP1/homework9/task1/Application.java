package bg.tu_varna.sit.b2.f23621689.homework9.task1;

public class Application {
    public static void main(String[] args) {
        Hotel hotel = new Hotel(10);

        hotel.addRoom(new SingleRoom(50, Exposure.SEA_VIEW, 4));
        hotel.addRoom(new DoubleRoom(100, Exposure.PARK_VIEW, 6, true));
        hotel.addRoom(new SingleRoom(45, Exposure.PARK_VIEW, 2));
        hotel.addRoom(new DoubleRoom(110, Exposure.SEA_VIEW, 7, false));

        System.out.println("Стаи в хотела:");
        System.out.println(hotel);

        hotel.createReservation();
        System.out.println("След резервация:");
        System.out.println(hotel);

        System.out.println("Обща отстъпка за заети стаи: " + hotel.calculateBookedRoomsDiscount());

        System.out.println("Средна цена за свободни стаи с морски изглед: " +
                hotel.calculateAveragePriceOfAvailableRoomsWithSeaView());
    }
}
