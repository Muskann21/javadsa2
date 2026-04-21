import java.util.Stack;
public class stack4 {
    public static void main(String[] args) {
        String abc="((()))";
        Stack<Character> sc=new Stack<>();
        for (int i = 0; i <abc.length(); i++) {
            if(abc.charAt(i)=='('){
                sc.push(abc.charAt(i));
            }
        }
        int count=0;
        for(int j=0;j<abc.length();j++){
            if(abc.charAt(j)==')'&& !sc.isEmpty()){
               sc.pop();
               count+=1;
            }
        }
        System.out.println("Number of parentheses:"+count);
    }
}
