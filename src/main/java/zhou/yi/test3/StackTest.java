package zhou.yi.test3;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @Author: XiaoLang
 * @Date: 2019/7/26 9:50
 */
public class StackTest {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.pop();
        List<Integer> x = new ArrayList<>(stack);
        System.out.println();
    }
}
