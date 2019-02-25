package zhou.yi.test;

public class test2 {
    public static void main(String[] args){
        int[][] nums = {{1,4,7},{2,5,8},{3,6,9}};
        test2 test2 = new test2();
        int[] rst = test2.xxx(nums,3,3);
        System.out.println(rst);
    }
    public int[] xxx(int[][] nums,int m,int n){
        int i = 0;
        int j = 0;
        int index = 0;
        int[] rst = new int[m * n];
        rst[index++] = nums[i++][j];
        int dir = 1;
        Boolean flag = true;
        while (flag){
            if(i == n -1 && j == m - 1){
                flag = false;
            }
            int dirx = dir % 2;
            if(dirx == 1){
                while (i != 0 && j != m - 1){
                    rst[index++] = nums[i][j];
                    i--;
                    j++;
                }
                if(i == 0){
                    rst[index++] = nums[i][j];
                    j++;
                }
                else if(j == m - 1){
                    rst[index++] = nums[i][j];
                    i++;
                }
            }else {
                while (j != 0 && i != n - 1){
                    rst[index++] = nums[i][j];
                    i++;
                    j--;
                }
                if (j == 0 && i != n - 1){
                    rst[index++] = nums[i][j];
                    i++;
                }
                else if(i == n -1){
                    rst[index++] = nums[i][j];
                    j++;
                }
            }
            dir++;
        }
        return rst;
    }
}
