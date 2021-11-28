import operations.Operations;

public class Tester {
    public static void main(String[] args) {
        int nItems = 10;
        Operations arr;
        arr = new Operations(nItems);

        arr.insert(0, 1);
        arr.insert(1, 8);
        arr.insert(2, 4);
        arr.insert(3, 6);
        arr.insert(4, 0);
        arr.insert(5, 3);
        arr.insert(6, 5);
        arr.insert(7, 2);
        arr.insert(8, 7);
        arr.insert(9, 9);

        System.out.print("Pre-sort array: ");
        arr.display();
        System.out.println("");


        System.out.println("");
        arr.bubbleSort();
        System.out.println("");

        System.out.print ("Post-sort array: ");
        System.out.println("");
        arr.display();

    }

}