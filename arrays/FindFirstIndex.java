import java.util.*;

class FindFirstIndex
{
    public static void main (String[] args)
    {
	Scanner scn = new Scanner(System.in);
	int size = scn.nextInt();
	int[] arr = new int[size];
	int ans = -1;
	int key = scn.nextInt();
	
	for(int i = 0; i < size; i ++)
	{
	    arr[i] = scn.nextInt();
	}
	for(int i = 0; i < size; i ++)
	{
	    if(arr[i] == key)
	    {
	        ans = i;
	        break;
	    }
	    
	}

	System.out.print(ans);
    }
}
