public class practice {
     public static void insertionsort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int first=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>first){
               int temp=arr[j];
               arr[j]=arr[j+1];
               arr[j+1]=temp;
               j--;
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
            insertionsort(arr);
            System.out.println("Sorted array=");
            printarr(arr);
        }
    }
    }

