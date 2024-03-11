import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @version 1.0
 * @Author liyuu
 * @Date 2024/3/3 9:08
 * @注释 用队列实现栈
 */
public class _225 {

    //队列初始化
    Queue<Integer> queue ;
    Queue<Integer> queue2;
    public void MyStack() {
    queue =new LinkedList<Integer>();
    queue2 = new LinkedList<Integer>();
    }

    public void push(int x) {
        queue2.offer(x);
        while (!queue.isEmpty()) {
            queue2.offer(queue.poll());
        }
        Queue<Integer> temp = queue;
        queue = queue2;
        queue2 = temp;


    }

    public int pop() {
        return  queue.poll();
    }

    public int top() {
        return  queue.peek();
    }

    public boolean empty() {
    return  queue.isEmpty();
    }
}
