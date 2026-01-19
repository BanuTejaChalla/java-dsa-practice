import java.util.*;

class DynamicArrSum
{
public static void main (String[] args) throws java.lang.Exception
{
	Scanner scn = new Scanner(System.in);
	int size = scn.nextInt();
	int sum = 0;
	int[] arr = new int[size];
        for (int i = 0; i < size; i++)
        {
            arr[i] = scn.nextInt();
        }
        for (int i = 0; i < size; i++)
        {
            sum = sum + arr[i];
        }
        System.out.println(sum);
	}
}
