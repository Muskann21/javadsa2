public class selectionsort {
    public static void selection(){
        int[] arr={7,3,8,2,5,4};
        int first=arr[0];
        for(int i=1;i<arr.length;i++){
            if (arr[i]<first){
                first=arr[i];
            }
        }
    }
}
