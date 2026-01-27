import java.util.*;
class Kadanes
{
	public static void main (String[] args)
	{
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int[] arr = new int[size];
        int sum = 0;
        int maxSum;
        
        for(int i = 0; i < size; i ++)
        {
            arr[i] = scn.nextInt();
        }
        for(int i = 0; i < size; i++)
        {
            sum = sum + arr[i];
            if(maxSum < sum)
            {
                maxSum = sum + maxSum; 
            }
            if (sum < 0)
            {
                sum = 0;
            }
        }
        System.out.println(maxSum);
	}
}


// Note: Code is still incomplete