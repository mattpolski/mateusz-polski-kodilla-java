package com.kodilla.testing.collection;

import java.util.*;

public class OddNumbersExterminator {

    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers)
     {
        ArrayList<Integer> listOfEven = new ArrayList<>();
        for(int even : numbers) {
            if(even % 2 == 0) {
                listOfEven.add(even);
            }
        }
        return listOfEven;
    }
}
