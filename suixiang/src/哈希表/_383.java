package 哈希表;

/**
 * @version 1.0
 * @Author liyuu
 * @Date 2023/12/18 10:31
 * @注释 赎金信
 */
public class _383 {
    public static void main(String[] args) {
        System.out.println(new _383().canConstruct("aa", "aab"));
    }
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] arr = new int[26];
        for(int i = 0;i < magazine.length();i++){
            arr[magazine.charAt(i) - 'a']++;
        }
        for(int i = 0;i < ransomNote.length();i++){
            if(--arr[ransomNote.charAt(i) - 'a'] < 0){
                return false;
            }
        }
        return true;
    }
}
