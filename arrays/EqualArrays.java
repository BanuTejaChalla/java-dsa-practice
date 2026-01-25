import java.util.*;

class EqualArrays
{
    public static void main (String[] args)
    {
	Scanner scn = new Scanner(System.in);
	int size1 = scn.nextInt();
	int[] arr1 = new int[size1];
	int size2 = scn.nextInt();
	int[] arr2 = new int[size2];
	boolean isTrue = true;
	//we start with the assumption that both the arrays are equal, hence we initialise the isTrue boolean value to true.
	
	for(int i = 0; i < size1; i++)
	{
	    arr1[i] = scn.nextInt();
	}
	for(int i = 0; i < size2; i++)
	{
	    arr2[i] = scn.nextInt();
	}
	
	if(size1 == size2)
        //checks if the two arrays are of equal sizes
	{
	    for(int i = 0; i <= size1 - 1; i++)
	    //if the sizes are equal then for every index we compare elements from both arrays one by one.
	    {
	        if(arr1[i] != arr2[i])
		//if they are not equal we set the isTrue value to false
                {
                    isTrue = false;
                }
	    }
	}
	else
	//if the sizes of the arrays are not equal then we set the isTrue value to false.
	{
	    isTrue = false;
	}	
    System.out.println(isTrue);
    //prints the final isTrue value
    }
}
