import java.util.Scanner;

public class linearsearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length:");
        int len=sc.nextInt();
        int[] arr=new int[len];
        for (int i=0;i<len;i++){
            System.out.println("Enter element:");
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter target number:");
        int reqd=sc.nextInt();
        int index=-1;
        for (int i = 0; i < len; i++) {
            if(arr[i]==reqd){
                index=i;
                System.out.println("Element found at index:"+index);
                break;
            }
        }
        if(index==-1){
            System.out.println("Element not found");
        }
    }
}
