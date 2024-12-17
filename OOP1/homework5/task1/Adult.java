package bg.tu_varna.sit.b2.f23621689.homework5.task1;

public class Adult extends Person{
    private IdentificationCard idCard;

    public Adult(String firstName, String secondName, String thirdName, IdentificationCard idCard) {
        super(firstName, secondName, thirdName);
        this.idCard = idCard;
    }

    public IdentificationCard getIdCard() {
        return idCard;
    }

    public void setIdCard(IdentificationCard idCard) {
        this.idCard = idCard;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + idCard.toString();
    }
}
