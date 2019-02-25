package zhou.yi.suanfa;

public class charu {
    public static void main(String[] args){
        charu c = new charu();
        int[] nums = {31,41,59,26,41,58};
        c.printNum(nums);
        for(int j = 1;j < nums.length;j++){
            int key = nums[j];
            int i = j - 1;
            while (i >= 0 && nums[i] > key){
                nums[i+1] = nums[i];
                i--;
            }
            nums[i+1] = key;
        }
        System.out.print("\n");
        c.printNum(nums);
    }

    public  void printNum(int[] nums){
        for (int num: nums) {
            System.out.print(num+"-");
        }
    }
}
