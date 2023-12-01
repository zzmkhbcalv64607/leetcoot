package easy;

public class _2586 {
    public static void main(String[] args) {
         _2586 test = new _2586();
            String[] words = {"ce","ai"};
            System.out.println(test.vowelStrings(words, 1, 1));
    }


    public int vowelStrings(String[] words, int left, int right) {
        int ans = 0;
        for (int i = left; i <= right; i++) {
            String s = words[i];
            char a = s.charAt(0), b = s.charAt(s.length() - 1);
            if ("aeiou".indexOf(a) != -1 && "eaiou".indexOf(b) != -1) ans++;
        }
        return ans;
    }


//    String[] word = {"a","e","i","o","u"};
//    public int vowelStrings(String[] words, int left, int right) {
//       // if (left == right) return 0;
//        int count = 0;
//        for (int i = left; i <=right; i++) {
//            if (isVowel(words[i])) count++;
//        }
//        return count;
//    }
//
//    private boolean isVowel(String worda) {
//        for (int i = 0; i < worda.length(); i++) {
//            if (worda.charAt(i) == 'a' || worda.charAt(i) == 'e'
//                    || worda.charAt(i) == 'i' || worda.charAt(i) == 'o'
//                    || worda.charAt(i) == 'u') return true;
//        }
//        return false;
//    }
}
