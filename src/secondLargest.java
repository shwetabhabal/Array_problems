public class secondLargest {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,3,2,11};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j+1]>arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]= temp;
                }
            }
        }
        System.out.println("second largest element in array is: "+arr[1] );
    }
}
