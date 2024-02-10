import java.util.PriorityQueue;

/**
 * @version 1.0
 * @Author liyuu
 * @Date 2024/2/6 9:55
 * @注释 魔塔游戏
 */
public class lcp30 {
    public static void main(String[] args) {
        lcp30 test = new lcp30();
        int[] nums = {100,100,100,-250,-60,-140,-50,-50,100,150};
        System.out.println(test.magicTower(nums));
    }
    public int magicTower(int[] nums) {
        int n = nums.length;
        long sum = 0;
        for (int num : nums) {
            sum += num;
        }
        if (sum < 0) {
            return -1;
        }
        long hp = 1;
        int res = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            if (nums[i] < 0) {
             //   System.out.println("nums[i] = " + nums[i]);
                pq.offer(nums[i]);
            }
            hp += nums[i];
          //  System.out.println("hp = " + hp);
            if (hp <= 0) {
                hp -= pq.poll();
                res++;
            }
          //  System.out.println("res = " + res);
        }
        return res;

    }
}
