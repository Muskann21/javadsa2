class linearsearch2{
    public static void main(String[] args){
        int[] arr={1,2,3,4,3,5,6};
        int reqd=7;
        int x=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==reqd){
                x+=1;
            }
        }
        if( x!=0){
        System.out.println("Frequency of"+reqd+"="+x);
        }
        else{
            System.out.println("Element not found");
        }
    }
}