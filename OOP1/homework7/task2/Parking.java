package bg.tu_varna.sit.b2.f23621689.homework7.task2;

public enum Parking {
    NO_PARKING(0),
    ONE_PLACE_FOR_RENT(1),
    ONE_PLACE_FOR_SALE(1),
    TWO_PLACES_FOR_RENT(2),
    TWO_PLACES_FOR_SALE(2);

    private int places;

    Parking(int places) {
        this.places = places;
    }

    public int getPlaces() {
        return places;
    }
}
