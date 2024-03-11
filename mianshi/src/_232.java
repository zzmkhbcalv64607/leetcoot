import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @version 1.0
 * @Author liyuu
 * @Date 2024/3/4 9:20
 * @注释 用栈实现队列
 */
public class _232 {
    Deque<Integer> inStack;
    Deque<Integer> outStack;

    public void MyQueue() {
        inStack = new ArrayDeque<Integer>();
        outStack = new ArrayDeque<Integer>();
    }

    public void push(int x) {
        inStack.push(x);
    }

    public int pop() {
        if (outStack.isEmpty()) {
            in2out();
        }
        return outStack.pop();
    }

    public int peek() {
        if (outStack.isEmpty()) {
            in2out();
        }
        return outStack.peek();
    }

    public boolean empty() {
        return inStack.isEmpty() && outStack.isEmpty();
    }

    private void in2out() {
        while (!inStack.isEmpty()) {
            outStack.push(inStack.pop());
        }
    }

}
