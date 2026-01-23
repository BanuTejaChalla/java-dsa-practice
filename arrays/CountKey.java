import java.util.*;

class CountKey
{
    public static void main (String[] args) 
    {
	Scanner scn = new Scanner(System.in);
	int size = scn.nextInt();
	int key = scn.nextInt();
	int count = 0;
	int[] arr = new int[size];
        for (int i = 0; i < size; i++)
        {
	    arr[i] = scn.nextInt();
        }
	for (int i = 0; i < arr.length; i++)
	{
	    if(arr[i] == key)
	    {
	        count++;
	    }
	}
	System.out.println(count);
    }
}
