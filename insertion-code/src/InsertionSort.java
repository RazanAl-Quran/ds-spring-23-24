// Java program for implementation of Insertion Sort
public class InsertionSort {
    /*Function to sort array using insertion sort*/
    void sort(int arr[])
    {
        // int arr[] = { 12, 11, 13, 5, 6 };
        for (int i = 1; i < arr.length; i++) {
            int currentValue = arr[i];
            int j = i - 1;

            /* Move elements of arr[0..i-1], that are
               greater than currentValue, to one position ahead
               of their current position */
            while (j >= 0 && arr[j] > currentValue) {  //strings >> while (j >= 0 && arr[j].compareTo(key) > 0)
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = currentValue;
        }
    }

    /* A utility function to print array of size n*/
    static void printArray(int arr[])
    {
        for (int i = 0; i < arr.length; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    // Driver method
    public static void main(String args[])
    {
        // int n = 5;
        // System.out.println(n++);
        // System.out.println(n);
        // System.out.println(++n);
        int arr[] = { 12, 11, 13, 5, 6 };

        InsertionSort ob = new InsertionSort();
        ob.sort(arr);

        printArray(arr);
    }
};


/* This code is contributed by Rajat Mishra. */
