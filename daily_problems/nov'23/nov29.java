import java.util.List;

public class nov29 { 

    public int isEulerCircuit(int V, List<Integer>[] adj) {
        int odd=0, ev = 0;

        for(int i=0; i<V; i++){
            if( adj[i].size() % 2 == 0 ) ev++;
            else odd++;
        }
        

        if( ev == V ) return 2;
        else if( odd > 0 && odd==2 ) return 1;
        return 0;
    
    }
}