public class linearsearch3 {
    public static void main(String[] args) {
        int[] arr={25,6,3,85,76,34};
        int largest=arr[0];
        int smallest=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<smallest){
                smallest=arr[i];
            }
        }
        for(int j=0;j<arr.length;j++){
            if(arr[j]>largest){
                largest=arr[j];
            }
        }
        System.out.println("Smallest:"+smallest);
        System.out.println("Largest:"+largest);
    }
}
