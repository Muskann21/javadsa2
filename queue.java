import java.util.*;
public class queue{
    public static void main(String[] args){
        Queue<Integer> que=new LinkedList<>();
        que.add(10);
        que.add(20);
        que.add(30);
        que.add(40);
        int x=0;
        while(!que.isEmpty()){
            que.remove(que.peek());
            x+=1;
        }
        System.out.println(x);
    }
}