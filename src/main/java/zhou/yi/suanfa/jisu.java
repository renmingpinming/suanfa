package zhou.yi.suanfa;

public class jisu {
    public static void main(String[] args){
        jisu j = new jisu();
        int[] nums = {31,41,59,26,41,58,45,33,10};
        j.printNum(nums);
        j.jisuSort(nums);
        System.out.print("\n");
        j.printNum(nums);
    }

    public void jisuSort(int[] nums){
        //求最大值
        int max = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
            }
        }
        int[] c = new int[max + 1];
        int[] r = new int[nums.length];
        //每个数字的个数数组
        for(int i = 0; i < nums.length; i++){
            c[nums[i]]++;
        }
        //个数累加数组
        for (int i = 1; i < c.length;i++){
            c[i] = c[i - 1] + c[i];
        }
        //倒序排序
        for(int i = nums.length - 1; i >= 0; i--){
            int index = c[nums[i]] - 1;
            r[index] = nums[i];
            c[nums[i]]--;
        }
        //把数组复制
        for(int i = 0; i < r.length;i++){
            nums[i] = r[i];
        }
    }

    public void printNum(int[] nums){
        for (int num: nums) {
            System.out.print(num+"-");
        }
    }
}
