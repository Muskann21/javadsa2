import java.util.Stack;
public class stack2 {
    public static void main(String[] args) {
        char[] arr={'[','{','(',')','}',']'};
        Stack<Character> sc=new Stack<>();
        for (int i=0;i<arr.length;i++){
            if(arr[i]=='{'||arr[i]=='['||arr[i]=='('){
               sc.push(arr[i]);
            }
        }
        for (int i=0;i<arr.length;i++){
            if(arr[i]==')'){
               if(sc.peek()=='('){
                  sc.pop();
               }
            }
            else if(arr[i]=='}'){
                if(sc.peek()=='{'){
                    sc.pop();
                }
            }
            else if(arr[i]==']'){
                if(sc.peek()=='['){
                    sc.pop();
                }
            }

        }
        if(!sc.isEmpty()){
            System.out.println("Not balanced");
        }
        else{
            System.out.println("Balanced");
        }
    }
}
