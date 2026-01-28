import java.util.*;

class ShiftArr
{
    public static void main (String[] args)
    {   
	Scanner scn = new Scanner(System.in);
	int size = scn.nextInt();
	int[] arr1 = new int[size];
	//takes shift count from the user input. This defines how many times the array shifts.
	int shift = scn.nextInt();
	int[] arr2 = new int[size];
		
	for(int i = 0; i < size; i++)
	{
	    arr1[i] = scn.nextInt();
	}
	
	for (int i = 0; i < size; i++)
	{
    	// Move each element to the left by (1 + shift) positions. (i + 1 + shift) computes the new source index.
    	// The modulo (%) ensures we wrap around to the start of the array. When the index goes beyond the array length.
    	arr2[i] = arr1[(i + 1 + shift) % size];
	// Print the rotated array as it is being built
    	System.out.print(arr2[i] + " ");
	}

    }
}
