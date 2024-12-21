package bg.tu_varna.sit.b2.f23621674.homework9.task4;

public class Election {
    private String dateOfElection;
    private Candidacy[] candidacies;
    private int[] votes;

    public Election(String dateOfElection, int numberOfCandidacies) {
        this.dateOfElection = dateOfElection;
        this.candidacies = new Candidacy[numberOfCandidacies];
        this.votes = new int[numberOfCandidacies];
    }

    public void addCandidacy(Candidacy candidacy, int index) {
        candidacies[index] = candidacy;
    }

    public void addResult(int index, int voteCount) {
        votes[index] = voteCount;
    }

    public void printOrderedByCandidacyId() {
        for (int i = 0; i < candidacies.length; i++) {
            for (int j = i + 1; j < candidacies.length; j++) {
                if (candidacies[i].getCandidacyId() > candidacies[j].getCandidacyId()) {
                    Candidacy tempCandidacy = candidacies[i];
                    candidacies[i] = candidacies[j];
                    candidacies[j] = tempCandidacy;

                    int tempVotes = votes[i];
                    votes[i] = votes[j];
                    votes[j] = tempVotes;
                }
            }
        }
        for (Candidacy candidacy : candidacies) {
            System.out.println(candidacy);
        }
    }

    public void printOrderedByVotes() {
        for (int i = 0; i < votes.length; i++) {
            for (int j = i + 1; j < votes.length; j++) {
                if (votes[i] < votes[j]) {
                    int tempVotes = votes[i];
                    votes[i] = votes[j];
                    votes[j] = tempVotes;

                    Candidacy tempCandidacy = candidacies[i];
                    candidacies[i] = candidacies[j];
                    candidacies[j] = tempCandidacy;
                }
            }
        }
        for (int i = 0; i < candidacies.length; i++) {
            System.out.println(candidacies[i] + " - Votes: " + votes[i]);
        }
    }

    public int getVotesByPerson(Person person) {
        int totalVotes = 0;
        for (int i = 0; i < candidacies.length; i++) {
            if (candidacies[i].getCandidatePresident().equals(person) || candidacies[i].getCandidateVicePresident().equals(person)) {
                totalVotes += votes[i];
            }
        }
        return totalVotes;
    }

    public void announceWinner() {
        int totalVotes = 0;
        for (int vote : votes) {
            totalVotes += vote;
        }

        for (int i = 0; i < votes.length; i++) {
            if (votes[i] > totalVotes / 2) {
                System.out.println("Winner: " + candidacies[i]);
                return;
            }
        }
        System.out.println("No winner. Proceeding to second round.");
    }
}
