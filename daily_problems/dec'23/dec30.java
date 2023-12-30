import java.util.HashMap;
import java.util.Map;

public class dec30 {
    
    static String[] winner(String arr[], int n) {

        HashMap<String,Integer> election = new HashMap<>();
        int maxVote = -1;

        for(int i=0; i<n; i++) {

            election.put(arr[i], election.getOrDefault(arr[i], 0)+1);
            maxVote = Math.max(maxVote, election.get(arr[i]));

        }
        String winnerCandidate = "";
        for(Map.Entry<String, Integer> entry :election.entrySet()) {
            
            if(entry.getValue() == maxVote) {
                if (winnerCandidate.equals("") || entry.getKey().compareTo(winnerCandidate) < 0) {
                    winnerCandidate = entry.getKey();
                }
            }
        }
        String result[] = {winnerCandidate, maxVote+""};
        return result;
    }

    public static void main(String[] args) {
        
        String[] arr = {"john","johnny","jackie","johnny","john","jackie","jamie","jamie","john","johnny","jamie","johnny","john"};

        System.out.println(winner(arr, arr.length));
    }
}
