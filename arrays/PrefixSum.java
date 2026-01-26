import java.util.*;

class PrefixSum
{
    public static void main (String[] args) throws java.lang.Exception
    {   
	Scanner scn = new Scanner(System.in);
	int size = scn.nextInt();
	int[] arr = new int[size];
	int[] prefix = new int[size];
	int sum = 0;
	
	for(int i = 0; i < size; i++)
	{
	    arr[i] = scn.nextInt();
	}
	for(int i = 0; i < size; i++)
	{
	    sum = sum + arr[i];
	    prefix[i] = sum;
	    System.out.print(prefix[i] + " ");
	}
    }
}
