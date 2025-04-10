package bg.tu_varna.sit.b2.f23621689.homework4;

import bg.tu_varna.sit.b2.f23621689.homework4.classes.SweetFactory;
import bg.tu_varna.sit.b2.f23621689.homework4.enums.SweetType;
import bg.tu_varna.sit.b2.f23621689.homework4.interfaces.Sweet;

public class Application {
    public static void main(String[] args) {
        SweetType[] sweets = {SweetType.CAKE, SweetType.DONUT, SweetType.ECLAIR, SweetType.GINGERBREAD};

        for (SweetType sweetType : sweets) {
            Sweet sweet = SweetFactory.createSweet(sweetType);
            System.out.println("Created: " + sweetType);
            sweet.prepare();
            System.out.println();
        }
    }
}
