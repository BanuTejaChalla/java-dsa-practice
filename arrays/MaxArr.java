import java.util.*;
class MaxArr
{
    public static void main (String[] args) 
    {
	Scanner scn = new Scanner(System.in);
	int size = scn.nextInt();
	int[] arr = new int[size];
        for (int i = 0; i < size; i++)
        {
            arr[i] = scn.nextInt();
        }
        int max = arr[0];
        for (int i = 1; i < size; i++)
        {
            if(max < arr[i])
            {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
