package algorithms;

import java.util.HashSet;

/**
 * Created by akanksha on 2/6/2018.
 */
public class JewelsAndStones {
    public int numJewelsInStones(String J, String S) {
        HashSet<Character> hs = new HashSet<>();
        int count = 0;
        for(int i = 0; i < J.length(); i++) {
            hs.add(J.charAt(i));
        }

        for(int j = 0; j < S.length(); j++) {
            if(hs.contains(S.charAt(j))) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String J = "aA";
        String S = "aAAbbbb";
        JewelsAndStones js = new JewelsAndStones();
        System.out.print(js.numJewelsInStones(J, S));
    }
}
