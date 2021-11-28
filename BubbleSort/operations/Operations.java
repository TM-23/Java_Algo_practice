package operations;


public class Operations{
    int[] arr;
    int temp = 0;
    int i = 0;
    int j = 0;


   public Operations(int init){
       arr = new int[init];
   }

   public void insert(int index, int value){
        arr[index] = value;
   }

   public void delete(int index){
        for(i = 0; i < arr.length-1; i++){
            arr[index] = arr[index + 1];
        } 
     }

    public void find(int value){
    for(i = 0; i < arr.length; i++){
        if(arr[i] == value){
            System.out.println("\nValue: " + value + " found at index pos " + i);
            break;
        }
    } if(i == arr.length){
            System.out.println("\nValue not found in the Array");
        } 
    }

    public void bubbleSort(){
        boolean swapped = false;

        for(i = 0 ; i < arr.length; i++ ){
            swapped = false;
            for(j = 0; j < (arr.length-1-i); j++){
                
                System.out.printf("Items compared: [%d, %d]",arr[j],arr[j+1]);

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

            }if(!swapped){
                break;
            }
            System.out.println("");
            System.out.printf("Iteration %d#: ", (i+1));
            display();
            System.out.println("");
            System.out.println("");


        }

    }
    

    public void display(){
        System.out.print("[ ");
        for (int item : arr) {
            System.out.print(item + " ");
        } 
        System.out.print("]");
    }
}