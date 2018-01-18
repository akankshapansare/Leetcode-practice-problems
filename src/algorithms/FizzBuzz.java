package algorithms;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by anike on 12/18/2017.
 */
public class FizzBuzz {
    public List<String> fizzBuzz1(int n) {
        ArrayList<String> list = new ArrayList<>();

        for(int i = 1; i <= n; i++){

            if(i % 3 == 0 && i % 5 == 0) {
                list.add("FizzBuzz");
            }
            else if(i % 5 == 0) {
                list.add("Buzz");
            }
            else if(i % 3 == 0) {
                list.add("Fizz");
            } else {
                list.add(String.valueOf(i));
            }
        }
        return list;
    }

    public static void main(String[] args) {
        FizzBuzz fz = new FizzBuzz();
        fz.fizzBuzz1(15);

    }
}

