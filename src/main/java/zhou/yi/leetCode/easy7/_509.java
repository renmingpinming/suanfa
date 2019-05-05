package zhou.yi.leetCode.easy7;

/**
 * @Author: XiaoLang
 * @Date: 2019/5/5 18:07
 */
public class _509 {
    public int fib(int N) {
        if (N == 0){
            return 0;
        }
        if (N == 1){
            return 1;
        }
        return fib(N - 1) + fib(N - 2);
    }

    public int fib2(int N) {
        if(N<2)return N;
        int ans[]=new int[N+1];
        ans[0]=0;
        ans[1]=1;
        for(int i=2;i<=N;i++){
            ans[i]=ans[i-1]+ans[i-2];
        }
        return ans[N];
    }

    public static void main(String[] args) {
        _509 test = new _509();
        System.out.println(test.fib(4));
    }
}
