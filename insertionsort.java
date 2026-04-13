public class insertionsort {
    public static void insertionsort(int[] arr){
        
        for(int i=0;i<arr.length;i++){
            int first=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>first){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                j--;
            }
            
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    
    }
    public static void main(String[] args) {
        int[] arr={2,6,3,8,5,7};
        insertionsort(arr);
    }
}
