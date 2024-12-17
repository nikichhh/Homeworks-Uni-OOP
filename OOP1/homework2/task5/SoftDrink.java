package bg.tu_varna.sit.b2.f23621689.homework2.task5;

import java.util.Objects;

public class SoftDrink {
    String brand;
    String expirationDate;
    int bottleVolume;
    double sugarAmmount;

    public SoftDrink(String brand, String expirationDate, int bottleVolume, double sugarAmmount) {
        this.brand = brand;
        this.expirationDate = expirationDate;
        this.bottleVolume = bottleVolume;
        this.sugarAmmount = sugarAmmount;
    }

    public String getBrand() {
        return brand;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public int getBottleVolume() {
        return bottleVolume;
    }

    public double getSugarAmmount() {
        return sugarAmmount;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SoftDrink softDrink = (SoftDrink) o;
        return bottleVolume == softDrink.bottleVolume && Double.compare(sugarAmmount, softDrink.sugarAmmount) == 0 && Objects.equals(brand, softDrink.brand) && Objects.equals(expirationDate, softDrink.expirationDate);
    }

    public String toString() {
        return "SoftDrink{" +
                "brand='" + brand + '\'' +
                ", expirationDate='" + expirationDate + '\'' +
                ", bottleVolume=" + bottleVolume +
                ", sugarAmmount=" + sugarAmmount +
                '}';
    }
}
