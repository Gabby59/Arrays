public class Duplicates {

    public static void main(String[] args) {
        int[] array1 = {1, 8, 13, 12, 11, 9, 5, 6, 7, 10}; //declare array1
        int[] array2 = {11, 3, 7, 2, 10, 15, 18, 9, 4, 6}; //declare array2

        System.out.println("These are array1 elements: ");
        for (int element1 : array1) { //loop though array1
            System.out.print(element1 +" "); //output array1 elements, on one line
        }
        System.out.println(" ");
        System.out.println("These are array2 elements: ");
        for (int element2 : array2) { //loop though array2
            System.out.print(element2 +" "); //output array2 elements, on one line
        }
        System.out.println(" ");

        System.out.println("These are the common elements of the arrays: ");
        for (int element1 : array1) { //loop though array 1
            for (int element2 : array2) { //and loop through array2
                if (element1 == element2) { //if one ele
                    System.out.print(element1 +" ");
                } //print values of array1 that are duplicated in array2
            }
        }
    }
}
