package algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class States {

    private ArrayList<String> states = new ArrayList<>(Arrays.asList("California", "Nevada", "Arizona", "Washington", "Oregon", "Montana", "Colorado", "Wayoming", "Florida", "Texas"));

    public void displayStates() {
        Iterator<String> iterator = states.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
