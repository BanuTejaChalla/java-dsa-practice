import java.util.*;
class SecondLargest
{
    public static void main (String[] args) 
    {
        Scanner scn = new Scanner(System.in);
        // Read the size of the array
        int size = scn.nextInt();

        // Create an array of the given size
        int[] arr = new int[size];

        // Read the elements of the array
        for(int i = 0; i < size; i++)
        {
            arr[i] = scn.nextInt();
        }

        // Declare variables to store the largest and second largest elements
        int max1, max2;

        // Initialize max1 and max2 using the first two elements
        if(arr[1] > arr[0])
        {
            max1 = arr[1];
            max2 = arr[0];        
        }
        else
        {
            max1 = arr[0];
            max2 = arr[1];
        }

        // Traverse the remaining elements of the array starting from index 2
        for (int i = 2; i < size; i++)
        {
            // If current element is greater than the largest so far
            if(arr[i] > max1)
            {
                // Update second largest before updating largest
                int temp = max1;
                max1 = arr[i];
                max2 = temp;
            }
            // If current element is between max1 and max2
            else if(arr[i] > max2)
            {
                // Update second largest
                max2 = arr[i];
            }
        }

        // Print the second largest element
        System.out.println("Second Largest: " + max2);
    }
}
