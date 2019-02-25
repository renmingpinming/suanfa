package zhou.yi.suanfa;

public class kuaisu {
    public static void main(String[] args){
        kuaisu k =  new kuaisu();
        int[] nums = {31,41,59,26,41,58,45,33,10};
        k.printNum(nums);
        k.quick_sort(nums,nums.length);
        System.out.print("\n");
        k.printNum(nums);
    }

    public void quick_sort(int[] nums,int n){
        quick_sort_c(nums,0,n - 1);
    }

    private void quick_sort_c(int[] nums, int p, int r) {
        if(p >= r){
            return;
        }
        int q = partition(nums,p,r);
        quick_sort_c(nums,0,q-1);
        quick_sort_c(nums,q+1,r);
    }

    private int partition(int[] nums, int p, int r) {
        int pivot = nums[r];
        int i = p;
        for(int j = p;j < r;j++){
            if(nums[j] < pivot){
                int k = nums[i];
                nums[i] = nums[j];
                nums[j] = k;
                i++;
            }
        }
        int k = nums[i];
        nums[i] = nums[r];
        nums[r] = k;
        return i;
    }

    public void printNum(int[] nums){
        for (int num: nums) {
            System.out.print(num+"-");
        }
    }
}
