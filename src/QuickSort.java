import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {

        int [] arr = {6,5,7,8,9,67,12,5,53,15,25};
        int length = arr.length;

        QuickSort quickSort = new QuickSort();
        quickSort.QuickSortRecursion(arr,0 , length - 1);

        System.out.println("Sorted Array = " + Arrays.toString(arr));

    }
    public int partition(int[] arr , int low , int high)
    {
        int pivot = arr[(low+high)/2]; // middle element is pivot element

        while (low <=high)
        {
            while (arr[low] < pivot)
            {
                low ++;
            }

            while (arr[high] > pivot)
            {
                high --;
            }

            if (low <= high)
            {
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;

                low ++;
                high --;
            }

        }
        return  low;
    }

    public void QuickSortRecursion(int[] arr, int low , int high)
    {
        int pi = partition(arr , low, high);

        if (low < pi-1)
        {
            QuickSortRecursion(arr , low ,pi - 1); // left hand side recursion
        }
        if (pi< high){
            QuickSortRecursion(arr , pi ,high); // Right hand side recursion
        }
    }
}
