package zhou.yi.suanfa;

public class dui {
    public static void main(String[] args) {
        dui dui = new dui();
        int[] nums = {7, 5, 19, 8, 4, 1, 20, 13, 16};
        dui.sort(nums);
        dui.printNum(nums);
    }

    public void sort(int[] nums) {
        bulidHeap(nums, nums.length - 1);
        int k = nums.length - 1;
        while (k > 0) {
            swap(nums, k, 0);//
            --k;
            heapify(nums, k, 0);
        }
    }

    public void bulidHeap(int[] nums, int n) {
        for (int i = n / 2; i >= 0; i--) {
            heapify(nums, n, i);
        }
    }

    public void heapify(int[] nums, int n, int i) {
        while (true) {
            int maxPos = i;
            if (i * 2 + 1 <= n && nums[i] < nums[i * 2 + 1]) {
                maxPos = i * 2 + 1;
            }
            if (i * 2 + 2 <= n && nums[maxPos] < nums[i * 2 + 2]) {
                maxPos = i * 2 + 2;
            }
            if (maxPos == i) {
                break;
            }
            swap(nums, maxPos, i);
            i = maxPos;
        }
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public void printNum(int[] nums) {
        for (int num : nums) {
            System.out.print(num + "-");
        }
    }
}
