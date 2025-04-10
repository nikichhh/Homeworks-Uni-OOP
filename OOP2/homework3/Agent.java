package bg.tu_varna.sit.b2.f23621689.homework3;

public abstract class Agent {
    protected String name;
    protected String phone;
    protected PropertyManager propertyManager;

    public Agent(String name, String phone) {
        this.name = name;
        this.phone = phone;
        this.propertyManager = PropertyManager.getInstance();
    }

}
