package SoftwareDev;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;

/**
 * Program to examine profiling tools provided by IDEs such as JProfiler. Creates a set of random numbers, assigns
 * then to an ArrayList, LinkedList, and HashMap and then deletes the numbers.
 */
public class Main {
    public static void main(String[] args) {
        //Generate the array of random Integers
        Integer[] randomNumbers = RandomNumberMaker.makeRandomNumbers(2000000);

        //Create collection objects to hold the same array but in different ways
        ArrayList<Integer> randomNumberArrayList = buildArrayList(randomNumbers);
        LinkedList<Integer> randomNumberLinkedList = buildLinkedList(randomNumbers);
        HashMap<Integer, Integer> randomNumberHashMap = buildHashMap(randomNumbers);

        //Delete the Integers stored in each collection
        deleteArrayList(randomNumberArrayList);
        deleteLinkedList(randomNumberLinkedList);
        deleteHashMap(randomNumberHashMap);
    }

    /**
     * Creates a HashMap to hold an array of Integers
     * @param randomNumbers An array of Integers, intended to be random.
     * @return A HashMap version of the array it was initially passed.
     */
    private static HashMap<Integer, Integer> buildHashMap(Integer[] randomNumbers){
        HashMap<Integer, Integer> newHashMap = new HashMap<>();
        for(int i = 0; i < randomNumbers.length; i++){
            newHashMap.put(i, randomNumbers[i]);
        }
        return newHashMap;
    }

    /**
     * Creates an ArrayList to hold an array of Integers
     * @param randomNumbers An array of Integers, intended to be random
     * @return An ArrayList version of the array it was initially passed
     */
    private static ArrayList<Integer> buildArrayList(Integer[] randomNumbers){
        return new ArrayList<>(Arrays.asList(randomNumbers));
    }

    /**
     * Creates a LinkedList to hold an array of Integers
     * @param randomNumbers An array of Integers, intended to be random
     * @return A LinkedList version of the array it was initially passed
     */
    private static LinkedList<Integer> buildLinkedList(Integer[] randomNumbers){
        return new LinkedList<>(Arrays.asList(randomNumbers));
    }

    /**
     * Deletes all the items stored in the passed ArrayList
     * @param randomNumberArrayList An ArrayList of random Integers
     */
    private static void deleteArrayList(ArrayList<Integer> randomNumberArrayList){
        while(randomNumberArrayList.size() > 0){
            randomNumberArrayList.remove(0);
        }
    }

    /**
     * Deletes all the items stored in the passed LinkedList
     * @param randomNumberLinkedList A LinkedList of random Integers
     */
    private static void deleteLinkedList(LinkedList<Integer> randomNumberLinkedList){
        while(randomNumberLinkedList.size() > 0){
            randomNumberLinkedList.remove(0);
        }
    }

    /**
     * Deletes all the items stored in the passed HashMap
     * @param randomNumberHashMap A HashMap of random Integers with Integer key objects
     */
    private static void deleteHashMap(HashMap<Integer, Integer> randomNumberHashMap){
        for(Integer key : randomNumberHashMap.keySet()){
            randomNumberHashMap.remove(key);
        }
    }
}