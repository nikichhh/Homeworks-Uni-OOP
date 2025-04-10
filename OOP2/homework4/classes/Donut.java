package bg.tu_varna.sit.b2.f23621689.homework4.classes;

import bg.tu_varna.sit.b2.f23621689.homework4.enums.CreamType;
import bg.tu_varna.sit.b2.f23621689.homework4.enums.DoughType;
import bg.tu_varna.sit.b2.f23621689.homework4.enums.FillingType;
import bg.tu_varna.sit.b2.f23621689.homework4.enums.GlazeType;
import bg.tu_varna.sit.b2.f23621689.homework4.interfaces.Sweet;

public class Donut implements Sweet {
    private final DoughType dough = DoughType.FAT;
    private final FillingType filling = FillingType.JAM;
    private final GlazeType glaze = GlazeType.SUGAR_GLAZE;
    private final CreamType cream = CreamType.NO_CREAM;

    @Override
    public void prepare () {
        System.out.println("Preparing a donut: " + dough + ", " + filling + ", " + glaze + ", " + cream + ", 1 layer.");
    }
}
