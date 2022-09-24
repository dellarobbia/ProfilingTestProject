package SoftwareDev;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Integer[] randomNumbers = RandomNumberMaker.makeRandomNumbers(2000000);
        ArrayList<Integer> randomNumberArrayList = new ArrayList<>(Arrays.asList(randomNumbers));
        LinkedList<Integer> randomNumberLinkedList = new LinkedList<>(Arrays.asList(randomNumbers));
        HashMap<Integer, Integer> randomNumberHashMap = buildHashMap(randomNumbers);
    }

    private static HashMap<Integer, Integer> buildHashMap(Integer[] randomNumbers){
        HashMap<Integer, Integer> newHashMap = new HashMap<>();
        for(int i = 0; i < randomNumbers.length; i++){
            newHashMap.put(i, randomNumbers[i]);
        }

        return newHashMap;
    }
}