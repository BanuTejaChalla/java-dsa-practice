import java.util.*;
class MinArr
{
    public static void main (String[] args) 
    {
	Scanner scn = new Scanner(System.in);
	int size = scn.nextInt();
	int[] arr = new int[size];
        for (int i = 0; i < size; i++)
        {
            arr[i] = scn.nextInt();
        }
	// Everything until here is the same as creating and taking inputs for an array.
	// we declare a new variable min and assign the first element of the array as the minimum element.
        int max = arr[0];
        for (int i = 1; i < size; i++)
	//loop starts from index 1, since index 0 is already assigned max.
        {
            if(min > arr[i])
            {
                min = arr[i];
		//if the ith index element of the array is smaller than the current min element, it is replaced. else it remains the same
            }
        }
	//do the same until all the elements in the array are traversed.
        System.out.println(min);
	//print the max element
    }
}
