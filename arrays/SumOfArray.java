//Sum Of elements in a array//

import java.util.*;

class SumOfArray
{
    public static void main (String[] args)
    {
	int[] arr = {10, 20, 30, 40, 50};
	//Create an array of integers
	int sum = 0;
	// create a variable for sum of elements and set it to 0
	for (int i = 0; i < arr.length; i++)
	//for every element in the array execute the following code
	{
	    sum = sum + arr[i];
	    //add the ith element to the sum
	}
	    System.out.println(sum);
	    //print the sum once the loop is done iterating
	}
}
