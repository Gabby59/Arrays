import java.util.Arrays;
import java.util.Random;

public class MaxAndMin {
    public static void main(String[] args) {

        int[] array = new int[5]; //declare array of 10 elements

        System.out.println("The array elements are: ");

        //loop to populate all (5) elements with generated random numbers
        for (int i = 0; i < array.length; i++) {
            Random rand = new Random();
            int num = rand.nextInt(10) + 20; // generate random numbers up to 10, to which then add 20
            array[i]= num; //populate the array with num elements
            System.out.println(array[i]); //print array
        }

        int min= array[0];//initialize min to first element of array
        int max = array[0]; //initialize max to first element of array


        for (int i = 0; i < array.length; i++) {    // loop through the array to compare array elements,
            if (array[i] < min) //compare for min value
                min = array[i]; //assign minimum value
            if (array[i] > max) // loop and compare for max value
                max = array[i]; //assign max value
        }
        System.out.println("The minimum value is: " + min); // print min value
        System.out.println("The maximum value is: " + max); //print max value
    }
}
