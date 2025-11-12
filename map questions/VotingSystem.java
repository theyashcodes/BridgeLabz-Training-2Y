
import java.util.*;

public class VotingSystem {
    public static void main(String[] args) {
        Map<String, Integer> votes = new HashMap<>();
        String[] voteList = {"A","B","A","C","B","A","C","A","B","A"};

        for(String v : voteList){
            votes.put(v, votes.getOrDefault(v, 0) + 1);
        }

        String winner = null;
        int max = -1;
        for(var e : votes.entrySet()){
            if(e.getValue() > max){
                max = e.getValue();
                winner = e.getKey();
            }
        }

        System.out.println(votes);
        System.out.println("Winner: " + winner);
    }
}
