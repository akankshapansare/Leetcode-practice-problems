package algorithms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SelfDividingNumbers {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> tempList = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (i % 10 != 0) {
                if (i / 10 == 0) {
                    list.add(i);
                } else {
                    int temp = i;
                    boolean flag = true;
                    while (temp % 10 != 0 || temp / 10 > 0) {
                        tempList.add(temp % 10);
                        temp = temp / 10;
                    }
                    for (Integer j : tempList) {
                        if (j == 0 || i % j != 0) {
                            flag = false;
                        }
                    }
                    tempList.clear();
                    if (flag) {
                        list.add(i);
                    }
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        SelfDividingNumbers sf = new SelfDividingNumbers();
        List<Integer> array = sf.selfDividingNumbers(66, 115);
        Iterator itr = array.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
