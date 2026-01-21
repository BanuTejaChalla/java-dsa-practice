import java.util.*;

class RevArrWithoutModification
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

    //prints the array is a reverse order starting from the index size - 1 
    for (int i = size - 1; i >= 0; i--)
    {
        System.out.print(arr[i] + " ");
    }
    }
}
