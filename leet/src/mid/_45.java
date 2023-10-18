package mid;

public class _45 {

    public static void main(String[] args) {
        _45 sol = new _45();
        int[] nums = {2,3,1,1,4};
        System.out.println(sol.jump(nums));
    }

    public int jump(int[] nums) {
        int ans = 0;
        int end = 0;
        int maxPos = 0;
        for (int i = 0; i < nums.length- 1; i++)
        {
            maxPos = Math.max(nums[i] + i, maxPos);
            if (i == end)
            {
                end = maxPos;
                ans++;
            }
        }
        return ans;
    }


}
