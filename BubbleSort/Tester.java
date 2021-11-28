import java.util.Random;

import operations.Operations;

public class Tester {
    public static void main(String[] args) {
        int nItems = 10;
        Operations ops;
        Random rnum = new Random();
        ops = new Operations(nItems); // creating Operations object

        // using insert method to add values to array
/*         ops.insert(0, 1);
        ops.insert(1, 8);
        ops.insert(2, 4);
        ops.insert(3, 6);
        ops.insert(4, 0);
        ops.insert(5, 3);
        ops.insert(6, 5);
        ops.insert(7, 2);
        ops.insert(8, 7);
        ops.insert(9, 9); */

        for(int i = 0; i < nItems; i++){
            ops.insert(i, rnum.nextInt(50));
        }



        System.out.print("Pre-sort array: ");
        ops.display(); // Displaying array before sorting
        System.out.println("");


        System.out.println("");
        ops.bubbleSort(); // Calling bubbleSort algo
    
        System.out.println("");

        System.out.print ("Post-sort array: ");
        System.out.println("");
        ops.display(); // Displaying array after sorting

    }

}