import java.util.*;

/**
 * @version 1.0
 * @Author liyuu
 * @Date 2024/2/15 11:11
 * @注释 O(1) 时间插入、删除和获取随机元素
 */
public class _380 {
    List<Integer> nums;
    Map<Integer, Integer> indices;
    Random random;
    public void RandomizedSet() {
        nums = new ArrayList<Integer>();
        indices = new HashMap<Integer, Integer>();
        random = new Random();



    }

    public boolean insert(int val) {
        if (indices.containsKey(val)) {
            return false;
        }
        int index = nums.size();
        nums.add(val);
        indices.put(val, index);
        return true;


    }

    public boolean remove(int val) {
        if (!indices.containsKey(val)) {
            return false;
        }
        int index = indices.get(val);
        int lastNum = nums.get(nums.size() - 1);
        nums.set(index, lastNum);
        indices.put(lastNum, index);
        nums.remove(nums.size() - 1);
        indices.remove(val);
        return true;
    }

    public int getRandom() {
        return nums.get(random.nextInt(nums.size()));
    }

}
