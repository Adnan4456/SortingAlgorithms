import java.util.Arrays;

public class HeapSort {

    public static void main(String[] args) {

        int[] arr = {22,13,14,11,17,5,2,4};
        HeapSort heapSort = new HeapSort();
        heapSort.sort(arr);

        System.out.println("Sorted array = " + Arrays.toString(arr));
    }
    public void sort(int[] arr)
    {
        int length = arr.length;

        for (int i = (length/2)-1; i>=0; i--)
        {
            heapify(arr, length , i);
        }

        //swap the elements and heapify again
        for (int i = length - 1 ; i >=0; i--)
        {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr , i,0);
        }
    }
    public void heapify(int[] arr ,  int n , int i)
    {
        int largest  = i;      // parent node index position
        int leftSide = 2*i+1;  // left child node index position
        int rightSide = 2*i+2; // Right child  node index position

        if (leftSide<n  &&  arr[leftSide]> arr[largest])
        {
            largest = leftSide;
        }
        if (rightSide<n && arr[rightSide]> arr[largest])
        {
            largest = rightSide;
        }

        if (largest != i)
        {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            heapify(arr , n , largest);
        }
    }
}
