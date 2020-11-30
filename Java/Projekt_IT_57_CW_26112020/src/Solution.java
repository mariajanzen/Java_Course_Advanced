import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {


    public String reverse(String text) {
        StringBuilder builder = new StringBuilder(text);
        builder.reverse();
        return builder.toString();
    }

    public int findTheIntegerWithoutCouple(ArrayList<Integer> ints) {
        int intWithoutCouple;
        HashMap<Integer, Integer> intsHashMap = new HashMap<>();
        for (int i = 0; i<ints.size(); i++) {
            intsHashMap.put(ints.get(i), i);
            }
        for (intsHashMap )
        }




    }
}
