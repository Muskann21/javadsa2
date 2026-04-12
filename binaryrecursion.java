public class binaryrecursion {
    public static int binsearch(int[] arr,int low,int high,int target){
        if(low>high){
            return -1;
        }
        int mid=low+(high-low)/2;
        if(arr[mid]==target){
            return mid;
        }
        else if(arr[mid]<target){
            return binsearch(arr,mid+1,high,target);
        }
        else{
            return binsearch(arr,low,mid-1,target);
        }
       
    }
    public static void main(String[] args) {
        int[] numbers={10,20,30,40,50,60,70,80,90};
        int result=binsearch(numbers,0,numbers.length-1, 80);
        if (result<0){
            System.out.println("Element not found");
        }else{
            System.out.println("Element at index:"+result);
        }
    }
}
