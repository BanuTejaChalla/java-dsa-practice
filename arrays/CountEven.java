import java.util.*;

class CountEven
{
    public static void main (String[] args) 
    {
	Scanner scn = new Scanner(System.in);
	int size = scn.nextInt();
	int count = 0;
	//Create a variable count to count the number of even numbers
	int[] arr = new int[size];
        for (int i = 0; i < size; i++)
        {
	    arr[i] = scn.nextInt();
        }
	for (int i = 0; i < arr.length; i++)
	{
	    if(arr[i] % 2 == 0)
	    // If the current element of the array is divisible by 2 increase the count by one, else do nothing
	    {
	        count++;
	    }
	}
        //print the final count after the entire array is traversed
	System.out.println(count);
    }
}
