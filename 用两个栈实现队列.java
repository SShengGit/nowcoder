https://www.nowcoder.com/practice/54275ddae22f475981afa2244dd448c6?answerType=1&f=discussion

思路：队列的特性是“先入先出”，栈的特性是“先入后出”
用两个栈实现队列，向栈1插入元素123，元素出栈并入栈2，此时栈2元素为321，将栈2元素从栈顶逐个弹出即可

import java.util.Stack;

public class Solution {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    
    public void push(int node) {
        stack1.push(node); // 元素入栈1
    }
    
    public int pop() {
    if (stack2.size() <= 0) { // 栈2为空
        while (stack1.size() != 0) { // 栈1不为空
            stack2.push(stack1.pop()); // 栈1元素出栈入栈栈2
        }
    }
        return stack2.pop(); // 栈2栈顶元素出栈
    }
}

