public class TestArray {
    public static void main(String[] args) {
        //declare inital sum variable and set to 0
        int sum = 0;

        //declare an int array of 10 elements
        int[] numbers = new int[10];

        //populate the array
        numbers[0] = 0;
        numbers[1] = 1;
        numbers[2] = 2;
        numbers[3] = 3;
        numbers[4] = 4;
        numbers[5] = 5;
        numbers[6] = 6;
        numbers[7] = 7;
        numbers[8] = 8;
        numbers[9] = 9;

        for (int element : numbers) {
          //  System.out.println(element); //loop though each element of the array
            sum = sum + element; // increase the sum with each element of the array
        }
        //print only the final Sum
        System.out.println(sum);

        //initialize the average variable as the total sum / 10 (given size of array)
        double average = sum / 10.0;

        //print average
        System.out.println(average);
    }
}
