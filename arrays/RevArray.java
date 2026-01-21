import java.util.*;

class RevArray
{
    public static void main (String[] args)
    {
	Scanner scn = new Scanner(System.in);
	int size = scn.nextInt();
	int[] arr = new int[size];

        for (int i = 0; i < size; i++)
        {
            arr[i] = scn.nextInt();
        }      
	//create two variables that act like pointers pointing to the either ends of the array initially.
        int left = 0; // left is set to first element
        int right = size - 1; // right is set to the last element

        while (left < right) // this loop runs until the index of left is smaller than the index of right
        {
	    //basic swap mechanism
            int temp = arr[left]; 
            arr[left] = arr[right]; 
            arr[right] = temp;
	    //update left and right to refer the right indices
            left++;
            right--;
        }
	// print the array
        for(int i = 0; i < size; i ++)
        {
            System.out.print(arr[i] + " ");
        }

    }
}
