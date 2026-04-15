public class twodbubblesort {
    public static void bubblesort(int[][] arr){
        

        boolean isswapped;
        for(int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length-1;j++){
                 isswapped=false;
                 for(int k=0;k<arr[i].length-1-j;k++){
                    if(arr[i][k]>arr[i][k+1]){
                        int temp=arr[i][k];
                        arr[i][k]=arr[i][k+1];
                        arr[i][k+1]=temp;
                        isswapped=true;
                    }
                 }
                 if(!isswapped){
                    break;
                 }
                
            }
        }
    }
    public static void main(String[] args) {
        int[][] arr={{3,1,2},
                   {6,4,5}};
        bubblesort(arr);
        for(int x=0;x<arr.length;x++){
            for (int y=0;y<arr[x].length;y++){
            System.out.print(arr[x][y]+" ");
        }
        System.err.println("");
    }
    }
}
