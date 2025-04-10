package bg.tu_varna.sit.b2.f23621689.homework4.classes;

import bg.tu_varna.sit.b2.f23621689.homework4.enums.SweetType;
import bg.tu_varna.sit.b2.f23621689.homework4.interfaces.Sweet;

public class SweetFactory {
    public static Sweet createSweet(SweetType type) {
        switch (type) {
            case DONUT:
                return new Donut();
            case ECLAIR:
                return new Eclair();
            case GINGERBREAD:
                return new Gingerbread();
            default: return new Cake();
        }
    }
}
