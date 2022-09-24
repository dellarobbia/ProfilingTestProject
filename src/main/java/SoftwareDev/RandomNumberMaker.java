package SoftwareDev;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Class containing static methods for creating random numbers
 */
public class RandomNumberMaker {
    /**
     * Creates an array of random integers to a specified quantity.
     * @param qty integer representing the number of random numbers to store in the array
     * @return integer array [qty]
     */
    public static Integer[] makeRandomNumbers(int qty){
        Integer[] randomNumberArray = new Integer[qty];

        for(int i = 0; i < qty; i++){
            randomNumberArray[i] = ThreadLocalRandom.current().nextInt();
        }

        return randomNumberArray;
    }
}
