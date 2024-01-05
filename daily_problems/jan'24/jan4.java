import java.util.HashMap;
import java.util.Map;

public class jan4 {
    static int singleElement(int[] arr , int N) {
        // code here
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int element : arr) {
            frequencyMap.put(element, frequencyMap.getOrDefault(element, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return -1;
    }
}
