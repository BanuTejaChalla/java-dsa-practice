import java.util.*;

class MaxConsecOnes {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int[] nums = new int[size];
        
        int count = 0;
        int max = 0;

        for (int i = 0; i < size; i++) {
            nums[i] = scn.nextInt();
        }

        for (int i = 0; i < size; i++) {
            if (nums[i] == 1) {
                count++;
                max = Math.max(max, count);
            } else {
                count = 0;
            }
        }

        System.out.println(max);
    }
}
