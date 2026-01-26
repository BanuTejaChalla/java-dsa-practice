import java.util.*;

class PrefixSum
{
    public static void main (String[] args) throws java.lang.Exception
    {   
	Scanner scn = new Scanner(System.in);
	int size = scn.nextInt();
	int[] arr = new int[size];
	int[] prefix = new int[size];			//creates a new array for the prefix sum of the same length as arr
	int sum = 0;
	
	for(int i = 0; i < size; i++)
	{
	    arr[i] = scn.nextInt();
	}
	for(int i = 0; i < size; i++)
	{
	    sum = sum + arr[i];				//sum is set to the addition of all the elements in arr until i index
	    prefix[i] = sum;				//the ith index of prefix sum array is se to sum value
	    System.out.print(prefix[i] + " ");		//prints the prefix array (in an unconventional way)
	}
    }
}
