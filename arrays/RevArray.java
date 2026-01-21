import java.util.*;

class RevArray
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

        int left = 0;
        int right = size - 1;

        while (left < right)
        {
            int temp = arr[left];
            arr[left] = arr[right]; 
            arr[right] = temp;
            left++;
            right--;
        }

        for(int i = 0; i < size; i ++)
        {
            System.out.print(arr[i] + " ");
        }

    }
}
