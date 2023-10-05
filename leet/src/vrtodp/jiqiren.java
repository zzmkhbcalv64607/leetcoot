package vrtodp;

public class jiqiren {
    /**
     *  1,1,1,1
     *  0 2
     *  1 3
     * @param args
     */
    public static void main(String[] args) {
        int N = 5;
        int start = 2;
        int aim = 4;
        int K = 6;
        jiqiren j = new jiqiren();
        System.out.println(j.ways1(N, start, aim, K));
    }

    public int ways1(int N,int start,int aim,int K){

    return  process1(N,start,aim,K);
    }

    /**
     * 机器人到达指定位置方法数
     * @param N 位置1~N
     * @param start 机器人当前位置
     * @param aim 机器人目标位置
     * @param K 剩余步数 K>=0
     * @return 方法数
     */
    public int process1(int N,int start,int aim,int K){
        if(K==0){
            return start==aim?1:0;
        }
        if(start==1){
            return process1(N,2,aim,K-1);
        }
        if(start==N){
            return process1(N,N-1,aim,K-1);
        }
        return process1(N,start+1,aim,K-1)+process1(N,start-1,aim,K-1);
    }
}
