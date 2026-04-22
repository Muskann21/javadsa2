import java.util.Stack;
public class stacknotation{
    public static void main(String[] args) {
        String abc="a*(b+c-d)";
        String str="";
        int x;
        Stack <Character> sc=new Stack<>();
        for (int i = 0; i <abc.length(); i++) {
            if(abc.charAt(i)=='^'){
            if(!sc.isEmpty()){
                while(sc.peek()=='('||sc.isEmpty()){
                    sc.pop();
                }
                sc.push(abc.charAt(i));
            }}
            else if(abc.charAt(i)=='/'||abc.charAt(i)=='*'){
            if(!sc.isEmpty()){
                if(sc.peek()=='/'||sc.peek()=='*'){
                     sc.pop();
                     str+=sc.pop();
                     sc.push(abc.charAt(i));
                }
                else{
                while(sc.peek()=='^'||sc.peek()=='('||sc.isEmpty()){
                    x=sc.pop();
                    str=str+x;
                }
                sc.push(abc.charAt(i));
            }
            }}
            else if(abc.charAt(i)=='+'||abc.charAt(i)=='-'){
            if(!sc.isEmpty()){
                if(sc.peek()=='+'||sc.peek()=='-'){
                     sc.pop();
                     str+=sc.pop();
                     sc.push(abc.charAt(i));
                }
                else{
                while(sc.peek()=='/'||sc.peek()=='*'||sc.peek()=='('||sc.isEmpty()){
                    x=sc.pop();
                    str=str+x;
                }
                sc.push(abc.charAt(i));
            }
            }}
            else if(abc.charAt(i)==')'){
                while(sc.isEmpty()){
                if(sc.pop()!='('){
                    str=str+sc.pop();
                }
            }}
        }
        System.out.println(str);
    }
}
