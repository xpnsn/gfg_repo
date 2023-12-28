public class nov28 {
    
	static int sumOfDependencies(ArrayList<ArrayList<Integer>> adj, int V) {
        	
		int sum = 0;
		for(ArrayLisst<Integer> i : adj) {
			sum += i.size();
		}
		return sum;
	}

}
