import java.util.Stack;
public class stack3 {
    public static void main(String[] args) {
    int[] arr={4,5,2,10};
    Stack<Integer> sc=new Stack<>();
    int x=0;
    for(int i=0;i<arr.length;i++){
        for (int j = i+1; j < arr.length; j++) {
            if(arr[i]<arr[j]){
                sc.push(arr[j]);
                break;
            }
            x=sc.peek();
        }
        if(x==sc.peek()){
            sc.push(-1);
        }
    }
    sc.push(-1);
    System.out.println(sc);
}
}