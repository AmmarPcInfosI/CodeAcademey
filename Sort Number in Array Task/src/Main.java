/*Problem: Given an array of integers nums, sort the array in ascending order.

Example:
Input: [5, 2, 3, 1]
Output: [1, 2, 3, 5]*/
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        int[] nums = {5, 2, 3, 1};
        Sort(nums);
        List<Integer> intList = new ArrayList<Integer>(nums.length);
        for (int num : nums) {
            intList.add(num);
        }
        System.out.println(intList);
    }

    public static void Sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            boolean swap = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap = true;
                }
            }


            if (!swap) {
                break;
            }
        }
    }
}
