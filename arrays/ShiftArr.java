import java.util.*;

class ShiftArr
{
    public static void main (String[] args)
    {   
	Scanner scn = new Scanner(System.in);
	int size = scn.nextInt();
	int[] arr1 = new int[size];
	int shift = scn.nextInt();
	int[] arr2 = new int[size];
		
	for(int i = 0; i < size; i++)
	{
	    arr1[i] = scn.nextInt();
	}
	
	for(int i = 0; i < size; i++)
	{
	    arr2[i] = arr1[(i + 1 + shift) % size];
	    System.out.print(arr2[i] + " ");
	}
    }
}
