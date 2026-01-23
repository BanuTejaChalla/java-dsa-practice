import java.util.*;

class DynamicArrSum
{
public static void main (String[] args)
{
	Scanner scn = new Scanner(System.in);
	int size = scn.nextInt();
	int sum = 0;
	int[] arr = new int[size];
	//Creating an array. By default the values of array will be 0s
        for (int i = 0; i < size; i++)
        {
            //For each value of i (index) one integer would be taken as an input
	    arr[i] = scn.nextInt();
	    //This is basically the part where the input for the array is taken
        }
        for (int i = 0; i < size; i++)
        {
            sum = sum + arr[i];
        }
        System.out.println(sum);
	}
}
