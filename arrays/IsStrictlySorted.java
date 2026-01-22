import java.util.*;
class IsStrictlySorted
{
    public static void main (String[] args)
    {
	Scanner scn = new Scanner(System.in);
	int size = scn.nextInt();
	int[] arr = new int[size];
	boolean isTrue = true;
	
	for (int i = 0; i < size; i++)
	{
	    arr[i] = scn.nextInt();
	}
	
	for(int i = 0; i < size-1; i++)
	{
	    if (arr[i] >= arr[i+1])
	    {
	        isTrue = false;
	    }
	}
        System.out.print(isTrue);
    }
}