import java.util.*;

class CountKey
{
    public static void main (String[] args) 
    {
	Scanner scn = new Scanner(System.in);
	int size = scn.nextInt();
	int key = scn.nextInt();
	// Take input for a key element that has to be counted
	int count = 0;
	//Create a variable count to count the nummber of appearances
	int[] arr = new int[size];
        for (int i = 0; i < size; i++)
        {
	    arr[i] = scn.nextInt();
        }
	for (int i = 0; i < arr.length; i++)
	{
	    if(arr[i] == key)
	    // If the current element of the array matches the key then, increase the count by one, else do nothing
	    {
	        count++;
	    }
	}
        //print the final count after the entire array is traversed
	System.out.println(count);
    }
}
