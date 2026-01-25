import java.util.*;

class ElementExists
{
    public static void main (String[] args) 
    {
	int[] arr = {10, 20, 30, 40, 50};
	int key = 90;
	boolean isTrue = false;
		
	for(int i = 0; i < arr.length; i++)
	{
	    if(arr[i] == key)
	    {
	        isTrue = true;
	        break;
	    }
	    
	}
    System.out.println(isTrue);
    }
}
