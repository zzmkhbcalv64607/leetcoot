package mid;

import java.nio.file.Path;
import java.util.Stack;

public class _71 {
    public static void main(String[] args) {
        _71 test = new _71();
        System.out.println(test.simplifyPath("/**/"));
    }
    public String simplifyPath(String path) {
        char[] charArray = path.toCharArray();
        Stack<Character> objects = new Stack<>();
        int i =0;
        int flag =0;
        while (i<charArray.length){

            if (objects.empty()||!objects.peek().equals(charArray[i])
                    ||(objects.peek()>'a'&&objects.peek()<'z') ){
                if (charArray[i]=='.'){
                    if (flag==2){
                        while (objects.peek()<'a'||objects.peek()>'z'){
                            objects.pop();
                        }
                        objects.pop();
                        objects.pop();
                        flag=0;
                    }else {
                        flag++;
                    }
                    }else{
                    objects.push(charArray[i]);
                }

            }

            i++;
        }


        StringBuilder s = new StringBuilder();
        //去除最后一个/
        if (objects.size()!=1&&objects.peek().equals('/')){
            objects.pop();
        }
        //
        for (Character object : objects) {
            s.append(object);
        }
        return s.toString();
    }

//    public String simplifyPath(String path) {
//        return Path.of(path).normalize().toString();
//    }
}
