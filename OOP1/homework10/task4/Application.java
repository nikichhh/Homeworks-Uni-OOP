package bg.tu_varna.sit.b2.f23621689.homework10.task4;

public class Application {
    public static void main(String[] args) {
        Person president1 = new Person("John", "Smith");
        Person vicePresident1 = new Person("Jane", "Doe");
        Person president2 = new Person("Robert", "Johnson");
        Person vicePresident2 = new Person("Emily", "Davis");

        Candidacy candidacy1 = new Candidacy(1, president1, vicePresident1, Party.AAA);
        Candidacy candidacy2 = new Candidacy(2, president2, vicePresident2, Party.BBB);

        Election election = new Election("2024-12-21", 2);
        election.addCandidacy(candidacy1, 0);
        election.addCandidacy(candidacy2, 1);

        election.addResult(0, 3000);
        election.addResult(1, 7000);

        System.out.println("Ordered by Candidacy ID:");
        election.printOrderedByCandidacyId();

        System.out.println("\nOrdered by Votes:");
        election.printOrderedByVotes();

        System.out.println("\nVotes for John Smith:");
        System.out.println(election.getVotesByPerson(president1));

        System.out.println("\nWinner:");
        election.announceWinner();
    }
}
