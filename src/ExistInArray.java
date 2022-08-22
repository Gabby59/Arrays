import java.util.Scanner;

public class ExistInArray {
    public static void main(String[] args) {

        int[] myArray = {2,4,6,7,3,44,25,42,65,98};  //declare integer array
        Scanner reader = new Scanner(System.in); //import Scanner

        System.out.println("Please insert an integer:"); //display message to user
        int input= Integer.parseInt(reader.nextLine()); //parse the user input to integer

        //loop through myArray
        for (int element : myArray) {
            //if the input is equal to one of the array elements output result
            if (element== input){
            System.out.println("Value " + input +" found in array.");
            break;
        }
            else { //if user input is not equal to any of the array element's
            System.out.println("Value " + input +" was not found in array.");}
            break;
        }
    }
}
