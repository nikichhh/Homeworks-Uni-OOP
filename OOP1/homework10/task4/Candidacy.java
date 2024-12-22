package bg.tu_varna.sit.b2.f23621689.homework10.task4;

public class Candidacy {
    private int candidacyId;
    private Person candidatePresident;
    private Person candidateVicePresident;
    private Party party;

    public Candidacy(int candidacyId, Person candidatePresident, Person candidateVicePresident, Party party) {
        this.candidacyId = candidacyId;
        this.candidatePresident = candidatePresident;
        this.candidateVicePresident = candidateVicePresident;
        this.party = party;
    }

    public int getCandidacyId() {
        return candidacyId;
    }

    public Party getParty() {
        return party;
    }

    public Person getCandidatePresident() {
        return candidatePresident;
    }

    public Person getCandidateVicePresident() {
        return candidateVicePresident;
    }

    @Override
    public String toString() {
        return "ID: " + candidacyId + ", President: " + candidatePresident + ", Vice President: " + candidateVicePresident + ", Party: " + party;
    }
}
