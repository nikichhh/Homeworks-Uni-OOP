package bg.tu_varna.sit.b2.f23621689.homework5.task1;

public class IdentificationCard {
    private String number;
    private int year;
    private String egn;
    private City city;

    public IdentificationCard(String number, int year, String egn, City city) {
        this.number = number;
        this.year = year;
        this.egn = egn;
        this.city = city;
    }

    public String getNumber() {
        return number;
    }

    public int getYear() {
        return year;
    }

    public String getEgn() {
        return egn;
    }

    public City getCity() {
        return city;
    }

    public String publishedBy() {
        return "МВР " + city.getName();
    }

    public int validUntil() {
        return year + 10;
    }

    @Override
    public String toString() {
        return "Лична карта номер: " + number + "\t\tИздадена от: " + publishedBy();
    }
}
