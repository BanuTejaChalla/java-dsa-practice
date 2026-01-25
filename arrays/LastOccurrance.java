import java.util.*;   
class LastOccurrance   
{
    public static void main (String[] args) 
    {
        Scanner scn = new Scanner(System.in);        
        int size = scn.nextInt();
        int key = scn.nextInt;
        int[] arr = new int[size];              
        int res = -1;                           
	// Store result index, -1 means not found
        for(int i = 0; i < size; i++)
        {
            arr[i] = scn.nextInt();
        }
       
        // Traverse array from right to left to find last occurrence
        for(int i = size-1; i >= 0; i--)
        {
            if(arr[i] == key)                   
	    // If key matches current element
            {
                res = i;
		// Store index of last occurrence
                break;
		// Stop immediately after finding it
            }
        }
        
        System.out.println(res);
	// Print result index
    }
}
