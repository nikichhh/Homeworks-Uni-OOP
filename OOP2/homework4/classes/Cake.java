package bg.tu_varna.sit.b2.f23621689.homework4.classes;

import bg.tu_varna.sit.b2.f23621689.homework4.enums.CreamType;
import bg.tu_varna.sit.b2.f23621689.homework4.enums.DoughType;
import bg.tu_varna.sit.b2.f23621689.homework4.enums.FillingType;
import bg.tu_varna.sit.b2.f23621689.homework4.enums.GlazeType;
import bg.tu_varna.sit.b2.f23621689.homework4.interfaces.Sweet;

public class Cake implements Sweet {
    private final DoughType dough = DoughType.SPONGE;
    private final FillingType filling = FillingType.VANILLA_CREAM;
    private final GlazeType glaze = GlazeType.CHOCOLATE_GLAZE;
    private final CreamType cream = CreamType.WHIPPED_CREAM;

    @Override
    public void prepare() {
        System.out.println("Preparing a donut: " + dough + ", " + filling + ", " + glaze + ", " + cream + ", 3 layers.");
    }
}
