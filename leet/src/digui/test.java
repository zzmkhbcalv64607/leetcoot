package digui;

public class test {
    public static void main(String[] args) {
        int [] s = {1,2,3};
        int [] s1 = new int[3];
        s1[0]=s[0];
        s1[1]=s[1];
        s1[2]=s[2];
        s1[1]=4;
        System.out.println(s1[1]);
        System.out.println(s[1]);

    }
}
