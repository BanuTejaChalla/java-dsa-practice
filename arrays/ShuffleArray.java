import java.util.*;

class ShuffleArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int n = size/2;
        int[] nums = new int[size];

        for(int i = 0; i < size; i++)
        {
            nums[i] = scn.nextInt();
        }

        int[] res = new int[size];
        for (int i = 0; i < n; i++) {
            result[2 * i] = nums[i];
            result[2 * i + 1] = nums[i + n];
        }

        for (int i = 0; i < size; i++) {
            System.out.print(result[i] + " ");
        }
    }
}