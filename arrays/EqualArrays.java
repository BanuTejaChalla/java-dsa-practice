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
	
	for(int i = 0; i < size1; i++)
	{
	    arr1[i] = scn.nextInt();
	}
	for(int i = 0; i < size2; i++)
	{
	    arr2[i] = scn.nextInt();
	}
	
	if(size1 == size2)
	{
	    for(int i = 0; i <= size1 - 1; i++)
	    {
	        if(arr1[i] != arr2[i])
                {
                    isTrue = false;
                }
	    }
	}
	else
	{
	    isTrue = false;
	}	
    System.out.println(isTrue);
    }
}
