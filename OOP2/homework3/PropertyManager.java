package bg.tu_varna.sit.b2.f23621689.homework3;

import java.util.ArrayList;
import java.util.List;

public class PropertyManager implements PropertyOperations{
    private static PropertyManager instance;
    private List<Property> properties;

    private PropertyManager() {
        properties = new ArrayList<>();
    }

    public static PropertyManager getInstance() {
        if (instance == null) {
            instance = new PropertyManager();
        }
        return instance;
    }

    @Override
    public void addProperty(Property property) throws PropertyException {
        if (properties.contains(property)) {
            throw new PropertyException("Property already exists in the list.");
        }
        properties.add(property);
    }

    @Override
    public void removeProperty(Property property) throws PropertyException {
        if (!properties.contains(property)) {
            throw new PropertyException("Property not found in the list.");
        }
        properties.remove(property);
    }

    public List<Property> getProperties() {
        return properties;
    }
}
