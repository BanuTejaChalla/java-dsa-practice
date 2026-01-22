import java.util.*;
class IsSorted
{
    public static void main (String[] args)
    {
	Scanner scn = new Scanner(System.in);
	int size = scn.nextInt();
	int[] arr = new int[size];
	//assumes that the array is already sorted.
	boolean isTrue = true;
	
	for (int i = 0; i < size; i++)
	{
	    arr[i] = scn.nextInt();
	}
	
	for(int i = 0; i < size-1; i++)
	{
	    //checks for any singular pair that proves the assumption that the array is sorted, wrong
	    if (arr[i] > arr[i+1])
	    {
		//if any pair found, then mark the boolean variable as false and print that in the final output
	        isTrue = false;
	    }
	}
        System.out.print(isTrue);
    }
}