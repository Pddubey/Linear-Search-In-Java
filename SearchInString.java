import java.util.Arrays;

public class SearchInString {
    public static void main(String[] args) {
        String name="priyanshu";
        char target='H';
        System.out.println(search1(name,target));
       // System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(search1(name,target));
    }
    static boolean search1(String str,char target){
        //basic case test
        if(str.length()==0){
            return false;
        }
        for(char ch: str.toCharArray()){
            if(ch==target){
                return true;
            }
        }
        return false;
    }
    static boolean search2(String str,char target){
        //basic test case
        if(str.length()==0){
            return false;
        }
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)==target){
                return true;
            }
        }
        return false;
    }
}
