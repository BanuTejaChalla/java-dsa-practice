import java.util.*;
class IsStrictlySorted
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
	    //Everything same as the normal sort check, but the only difference in Strictly Sorted is, even equal values count as unsorted values
	    if (arr[i] >= arr[i+1])
	    {
		//if any pair found, then mark the boolean variable as false and print that in the final output
	        isTrue = false;
	    }
	}
        System.out.print(isTrue);
    }
}