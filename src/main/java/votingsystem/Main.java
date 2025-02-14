package votingsystem;

public class Main {
    public static void main(String[] args) {
        VotingSystem.addCandidates("Raj", 4500);
        VotingSystem.addCandidates("Rajesh", 6500);
        VotingSystem.addCandidates("Pankaj", 6000);
        VotingSystem.addCandidates("Sanjay", 2300);
        VotingSystem.addCandidates("Pritam", 1200);

        System.out.println(VotingSystem.hashMap);
        VotingSystem.showSortedVotes();
        VotingSystem.showOrderOfVotes();
    }
}