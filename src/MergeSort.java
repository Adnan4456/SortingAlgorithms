import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort {

    int[] arr;
    int[] temp;
    int length;

    public static void main(String[] args) {

        int[] a = {34, 65, 32, 1, 4, 6, 78, 6, 12, 34, 56, 3};
        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(a);

        System.out.println("Sorted Array = " + Arrays.toString(a));
    }

    public void sort(int arr[]) {
        this.arr = arr;
        this.length = arr.length;
        this.temp = new int[length];
        divideArray(0, length-1);
    }
       //in start  higher index is 11
    public void divideArray(int lowerIndex , int higherIndex)
    {
        //condition true until 5 value come
        if (lowerIndex<higherIndex) //Let 0
        {
            //divide array into 2 parts.
            //find the middle index of array every time.
            // 0 + (11-0)/2 = 5.5;
            int mid = lowerIndex + (higherIndex - lowerIndex)/2;

            //it will left side of array
            //0 to 5.
            //function will call itself until all of left side elements are divided.
            divideArray(lowerIndex , mid);

            //it will sort right side of an array
            // 6 to 11.
            //function will call itself until all of right side elements are divided.
            divideArray(mid+1 , higherIndex);

            mergeArray(lowerIndex , mid , higherIndex);
        }
    }

    public void mergeArray(int lowerIndex , int middleIndex , int higherIndex)
    {
        for (int i = lowerIndex; i<=higherIndex; i++)
        {
            this.temp[i] = arr[i];
        }
        int i = lowerIndex;
        int j = middleIndex + 1;
        int k =  lowerIndex;

        while (i<=middleIndex && j<=higherIndex)
        {
            if (temp[i]<= temp[j]){
                arr[k] = temp[i];
                i++;
            }
            else {

                arr[k] = temp[j];
                j++;
            }
            k++;
        }

        while (i<= middleIndex){

            arr[k] = temp[i];
            k++;
            i++;
        }
    }

}
