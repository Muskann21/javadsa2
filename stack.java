import java.util.Stack;
public class stack {
    public static void main(String[] args) {
        Stack<String> sc=new Stack<>();
        sc.push("M");
        sc.push("u");
        sc.push("s");
        sc.push("k");
        sc.push("a");
        sc.push("n");
        Stack<String> obj=new Stack<>();
        while(!sc.isEmpty()){
            obj.push(sc.pop());
        }
        while(!obj.isEmpty()){
            System.out.print(obj.pop());
        }
       
    }
}
