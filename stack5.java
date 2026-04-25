import java.util.Stack;
public class stack5 {
    public static void main(String[] args) {
        Stack<Integer> sc=new Stack<>();
        Stack<Integer> sc2=new Stack<>();
        Stack<Integer> sc3=new Stack<>();
        Stack<Integer> sc4=new Stack<>();
        sc.push(1);
        sc.push(2);
        sc.push(3);
        sc2.push(4);
        sc2.push(5);
        sc2.push(6);
        while(!sc2.isEmpty()) {
            sc3.push(sc2.pop());
        }
        while(!sc.isEmpty()){
            sc3.push(sc.pop());
        }
        while(!sc3.isEmpty()){
            sc4.push(sc3.pop());
        }
        System.out.print(sc4);
    }
}
