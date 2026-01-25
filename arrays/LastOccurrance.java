import java.util.*;
class LastOccurrance
{
    public static void main (String[] args) 
    {
	Scanner scn = new Scanner(System.in);
	int size = scn.nextInt();
	int key = scn.nextInt();
        int[] arr = new int[size];
        int res = -1;
	for(int i = 0; i < size; i++)
	{
	    arr[i] = scn.nextInt();
 	}
       
        for(int i = size-1; i >= 0; i--)
        {
            if(arr[i] == key)
            {
                res = i;
                break;
            }
        }
    System.out.println(res);
    }
}
