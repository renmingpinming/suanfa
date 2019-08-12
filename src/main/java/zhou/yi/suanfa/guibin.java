package zhou.yi.suanfa;

public class guibin {
    public static void main(String[] args) {
        guibin g = new guibin();
        int[] nums = {31, 41, 59, 26, 41, 58, 45, 33, 10};
        g.printNum(nums);
        g.sort(nums, 0, nums.length - 1);
        System.out.print("\n");
        g.printNum(nums);
    }

    public void sort(int[] nums, int low, int high) {
        int mid = (low + high) / 2;
        if (low < high) {
            sort(nums, low, mid);
            sort(nums, mid + 1, high);
            merge(nums, low, mid, high);
        }
    }

    public void merge(int[] nums, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];
        int i = low;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= high) {
            if (nums[i] < nums[j]) {
                temp[k++] = nums[i++];
            } else {
                temp[k++] = nums[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = nums[i++];
        }

        while (j <= high) {
            temp[k++] = nums[j++];
        }

        for (int x = 0; x < temp.length; x++) {
            nums[x + low] = temp[x];
        }
    }

    public void printNum(int[] nums) {
        for (int num : nums) {
            System.out.print(num + "-");
        }
    }
}
