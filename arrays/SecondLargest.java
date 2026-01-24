import java.util.*;
class SecondLargest
{
    public static void main (String[] args) 
    {
	Scanner scn = new Scanner(System.in);
	int size = scn.nextInt();
	int[] arr = new int[size];
        for(int i = 0; i < size; i++)
        {
            arr[i] = scn.nextInt();
        }
        int max1, max2;
	if(arr[1] > arr[0])
	{
 	    max1 = arr[1];
    	    max2 = arr[0];        
	}
	else
	{
	    max1 = arr[0];
	    max2 = arr[1];
	}
        for (int i = 2; i < size; i++)
        {
            if(arr[i] > max1)
            {
                int temp = max1;
                max1 = arr[i];
                max2 = temp;
            }
            else if(arr[i] > max2)
            {
                max2 = arr[i];
            }
            
        }
        System.out.println("Second Largest: " + max2);
    }
}
