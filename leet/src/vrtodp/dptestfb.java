package vrtodp;

public class dptestfb {
    public static void main(String[] args) {
        dptestfb test = new dptestfb();
        System.out.println(test.ww(5));
    }

    public int ww(int n){
        if (n==1||n==0){
            return n;
        }
        int [] w= new int[n+1];
        w[0]=0;
        w[1]=1;
        for(int i =2;i<=n;i++){
            w[i]=w[i-2]+w[i-1];
        }
        return w[n];
    }
}
