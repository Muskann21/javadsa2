public class selectionsort {
    public static void selection(){
        int[] arr={7,3,8,2,5,4};
        for(int i=0;i<arr.length;i++){
            int first=i;
          for(int j=i+1;j<arr.length;j++){
            if (arr[j]<arr[first]){
                first=j;
            }
        }
        int temp=arr[first];
        arr[first]=arr[i];
        arr[i]=temp;
    }

    for(int k=0;k<arr.length;k++){
            System.out.println(arr[k]+" ");
        }
}
public static void main(String[] args) {
    selection();
}
}
