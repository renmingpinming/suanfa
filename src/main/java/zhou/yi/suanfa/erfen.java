package zhou.yi.suanfa;

public class erfen {
    public static void main(String[] args){
        erfen e = new erfen();
        int[] nums = {1,2,3,4,5,6,7,8,9};
        int index = e.bsearch(nums,nums.length,9);
        System.out.println(index);
    }

    public int bsearch(int[] nums,int n,int value){
        return binarySearch(nums,0,n - 1,value);
    }

    private int binarySearch(int[] nums,int low,int high,int value){
        int mid = low + ((high - low)>>1);
        if(low > high){
            return -1;
        }
        if(nums[mid] == value){
            return mid;
        }
        else if(nums[mid] > value){
            return binarySearch(nums,low,mid - 1,value);
        }else {
            return binarySearch(nums,mid + 1,high,value);
        }
    }
}
