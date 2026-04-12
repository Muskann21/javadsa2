public class bubblesort {
    public static void bubbleSort(int[] arr){
        int n=arr.length;
        boolean isswapped;
        for(int i=0;i<n-1;i++){
            isswapped=false;
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                isswapped=true;
            }}
        if(!isswapped){
            break;
        }
        }
    }
    public static void printarr(int[] arr){
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        {
            int[] arr={7,2,6,9,6,3,2,5,4,1,8};
            System.out.println("Unsorted array=");
            printarr(arr);
            bubbleSort(arr);
            System.out.println("Sorted array=");
            printarr(arr);
        }
    }
}
