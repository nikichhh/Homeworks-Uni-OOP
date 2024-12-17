package bg.tu_varna.sit.b2.f23621689.homework4.task08;

public class Balloon {
    private double diameter;
    private double area;
    private double volume;

    public Balloon() {}

    public Balloon(double area) {
        this.area=area;
        this.volume=0.0;
        this.diameter=0.0;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public void calculateVolume(int blowings) {
        if (blowings <= 0) {
            System.out.println("Not a proper number of blowings");
            return;
        }
        double criticalVolume = (1.0 / 6) * Math.sqrt(10 * Math.pow(area, 3) / Math.PI);
        for (int i = 1; i <= blowings; i++) {
            volume += 0.5;
            if (volume > criticalVolume) {
                volume = 0.0;
                break;
            }
        }
        // Превръщане на кубични дециметри в кубични сантиметри
        volume *= 1_000;
    }

    public double calculateDiameter() {
        if (volume == 0.0) {
            return 0.0;
        }
        diameter = 2 * Math.cbrt((3 * volume) / (4 * Math.PI));
        return diameter;
    }
}
