import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {

        int[] arr = {6,10,4,3,2,1,1,255,54,3,21,45,67,9,0};
        int swap;

        for (int i =0 ; i<arr.length; i++)
        {
            int flag = 0;

            //minus i because we donot compare sorted elements in the list
            for (int j=0; j<arr.length-1-i; j++)
            {
                //for sorting string arr use compareTo method
                //if(arr[j].compareTo(arr[j+1])>0)
                //Compare To method return 0 , 1 or -1
                if (arr[j]>arr[j+1]){

                    swap = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = swap;
                    flag =1;
                }
            }
            //we donot want to  use loop if elements are sorted before loop ends.
            if (flag ==0){
                break;
            }
        }
        System.out.println("Sorted array = " + Arrays.toString(arr));
    }
}
