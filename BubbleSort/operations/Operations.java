package operations;


public class Operations{
    int[] arr; // declaring array
    int temp = 0;
    int i = 0;
    int j = 0;


   public Operations(int init){
       arr = new int[init]; //initializing array with parameter 'init' value(s) 
   }

   public void insert(int index, int value){
        arr[index] = value; //overwriting value at index position
   }

   public void delete(int index){
        for(i = 0; i < arr.length-1; i++){ // arr.length-1 = last index position
            arr[index] = arr[index + 1]; // Assigning value adjacent to arr[index] to arr[index]
        } 
     }

    public void find(int value){
    for(i = 0; i < arr.length; i++){
        if(arr[i] == value){ // check to see if int value at arr[i] is the same as the int value parameter
            System.out.println("\nValue: " + value + " found at index pos " + i);
            break; // break loop if value is found in the array
        }
    } if(i == arr.length){ // if true, then we looped through the whole thing and didn't find the value in the array
            System.out.println("\nValue not found in the Array");
        } 
    }

    public void bubbleSort(){

        boolean swapped = false;
        long start = System.nanoTime();

        for(i = 0 ; i < arr.length; i++ ){
            swapped = false;

            for(j = 0; j < (arr.length-1-i); j++){ // (arr.length-1-i) == 9 at first iteration, reducing by i(1) each time.
                                                    // essentially shortening the array after each iteration because the
                                                    // largest value is pushed to the end of the array each time.
                System.out.printf("Items compared: [%d, %d]",arr[j],arr[j+1]);
                // Swapping lower values with higher ones, shifting to the right.
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                    swapped = true;
                    System.out.printf(" => swapped [%d, %d]", arr[j], arr[j+1]);
                    System.out.println("");
                    
                } else {
                    System.out.print(" => not swapped\n");
                }

            }
            if(!swapped){ // this means that if swapped is not equal to true
                break; // nothing was swapped, so we assume the array has been sorted and break out
            }
            System.out.println("");
            System.out.printf("Iteration %d#: ", (i+1));
            display();
            System.out.println("");
            System.out.println("");

        }
        // 
        long end = System.nanoTime();
        long execNanoSeconds = end - start;
        double execTimeSeconds = (double)execNanoSeconds / 1_000_000_000;
        double finalTime = Math.round(execTimeSeconds * 100.0) / 100.0;
        System.out.println("");
        System.out.println("Execution time: " + finalTime + " seconds ~");
    }
    

    public void display(){
        System.out.print("[ ");
        for (int item : arr) {
            System.out.print(item + " ");
        } 
        System.out.print("]");
    }
}