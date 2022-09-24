package SoftwareDev;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Class containing static methods for creating random numbers
 */
public class RandomNumberMaker {
    /**
     * Creates an array of random integers to a specified quantity.
     * @param qty
     * @return integer array [qty]
     */
    public static int[] makeRandomNumbers(int qty){
        int[] randomNumberArray = new int[qty];

        for(int i = 0; i < qty; i++){
            randomNumberArray[i] = ThreadLocalRandom.current().nextInt();
        }

        return randomNumberArray;
    }
}
