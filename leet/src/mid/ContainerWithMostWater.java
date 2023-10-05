package mid;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int i = maxArea(new int[]{1,0,0,0,0,0,0,2,2});
        System.out.println(i);
    }

    /**
     * 给定一个长度为 n 的整数数组 height 。有 n 条垂线，第 i 条线的两个端点是 (i, 0) 和 (i, height[i]) 。
     * 找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水
     *
     * 双指针法
     * 从数组的两边开始，向中间移动，每次移动短板，因为移动长板，容器的面积只会变小
     * 当两个指针相遇时，说明已经无法构成桶子
     * 容积=短板*两个指针之间的距离
     * @param height
     * @return
     */
    public static int maxArea(int[] height) {
        int max=0;
        int i=0;
        int j = height.length-1;
        while(i<j){

            if ((Math.min(height[i],height[j])*(j-i))>max)  max = Math.min(height[i],height[j])*(j-i);
            if (height[i]<height[j]){
                i++;
            }else{
                j--;
            }

        }

        return max;
    }
}
