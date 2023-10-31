package mid;

public class _74 {
    public static void main(String[] args) {
        _74 test = new _74();
        System.out.println(test.searchMatrix(new int[][]{{1}}, 1));
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int len =matrix.length;
        int wi=matrix[0].length;
        /**
         * 从每一行的最右边开始进行比较，如果target比最右边的小，则说明target可能在这一行或者是不存在
         * 当target比最左边的大比最右边小的时候，说明target可能在这一行或者是不存在，所以开始循环查找
         */
        for (int j=0;j<wi;j++){
            if (target<=matrix[len-1][j]&&target>=matrix[0][j]){
                for (int i=0;i<=len-1;i++){
                    if (target==matrix[i][j]){
                        return true;
                    }
                }

            }

        }
        return false;
    }
}
