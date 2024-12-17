package bg.tu_varna.sit.b2.f23621689.homework3.task3;

public class Adult extends Person{
    private IdentificationCard identificationCard;

    public Adult(String firstName, String secondName, String thirdName, IdentificationCard identificationCard) {
        super(firstName, secondName, thirdName);
        this.identificationCard = identificationCard;
    }

    public IdentificationCard getIdentificationCard() {
        return identificationCard;
    }

    public void setIdentificationCard(IdentificationCard identificationCard) {
        this.identificationCard = identificationCard;
    }

    public String getPersonalInformation() {

        return iAm() + "\n\nЛична карта номер: " + identificationCard.getNumber()
                + "\tИздадена от: " + identificationCard.getCity().getName();
    }
}
