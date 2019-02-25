package zhou.yi.suanfa;

public class erfanHard {
    public static void main(String[] args){
        erfanHard e = new erfanHard();
        int[] nums = {1,2,4,5,5,5,5,7,8,8,8,9};
        int[] nums2 = {3,5,6,8,10};
        int index = e.bsearch1(nums,nums.length,5);
        System.out.println(index);
        int index2 = e.bsearch2(nums,nums.length,8);
        System.out.println(index2);
        int index3 = e.bsearch3(nums,nums.length,3);
        System.out.println(index3);
        int index4 = e.bsearch4(nums2,nums2.length,9);
        System.out.println(index4);
        int index5 = e.bsearch4(nums,nums.length,6);
        System.out.println(index5);
    }

    //查找第一个值等于给定值的元素
    public int bsearch1(int[] nums,int n,int value){
        int low = 0;
        int high = n - 1;
        while (low <= high){
            int mid = low + ((high - low)>>1);
            if(nums[mid] > value){
                high = mid - 1;
            }else if(nums[mid] < value){
                low = mid + 1;
            }else {
                if((mid == 0) || nums[mid - 1] != value){
                    return mid;
                }else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }

    //查找最后一个值等于给定值的元素
    public int bsearch2(int[] nums,int n,int value){
        int low = 0;
        int high = n - 1;
        while (low <= high){
            int mid = low + ((high - low)>>1);
            if(nums[mid] > value){
                high = mid - 1;
            }else if(nums[mid] < value){
                low = mid + 1;
            }else {
                if((mid == 0) || nums[mid + 1] != value){
                    return mid;
                }else {
                    low = mid + 1;
                }
            }
        }
        return -1;
    }

    //查找第一个大于等于给定值的元素
    public int bsearch3(int[] nums,int n,int value){
        int low = 0;
        int high = n - 1;
        while (low <= high){
            int mid = low + ((high - low)>>1);
            if(nums[mid] >= value){
                if(mid == 0 || nums[mid - 1] < value){
                    return mid;
                }else {
                    high = mid - 1;
                }
            }else if(nums[mid] < value){
                low = mid + 1;
            }
        }
        return -1;
    }

    //查找最后一个小于等于给定值的元素
    public int bsearch4(int[] nums,int n,int value){
        int low = 0;
        int high = n - 1;
        while (low <= high){
            int mid = low + ((high - low)>>1);
            if(nums[mid] > value){
                high = mid - 1;
            }else {
                if(mid == 0 || nums[mid + 1] > value){
                    return mid;
                }else {
                    low = mid + 1;
                }
            }
        }
        return -1;
    }
}
