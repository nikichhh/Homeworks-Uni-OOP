package bg.tu_varna.sit.b2.f23621674.homework9.task3;

public class Register {
    private Owner[] owners;
    private int ownerCount;

    public Register(int capacity) {
        this.owners = new Owner[capacity];
        this.ownerCount = 0;
    }

    public boolean addRegistration(Owner owner) {
        if (ownerCount >= owners.length) {
            System.out.println("Register is full. Cannot add more owners.");
            return false;
        }
        owners[ownerCount++] = owner;
        return true;
    }

    public Owner findOwnerByEgn(String egn) {
        for (int i = 0; i < ownerCount; i++) {
            if (owners[i].getPerson().getEgn().equals(egn)) {
                return owners[i];
            }
        }
        return null;
    }

    public Car findCarByRegistration(String brand, String model) {
        for (int i = 0; i < ownerCount; i++) {
            Owner owner = owners[i];
            for (int j = 0; j < owner.getCarCount(); j++) {
                Car car = owner.getCars()[j];
                if (car.getBrand().equals(brand) && car.getModel().equals(model)) {
                    return car;
                }
            }
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ownerCount; i++) {
            sb.append(owners[i].toString()).append("\n");
        }
        return sb.toString();
    }
}
