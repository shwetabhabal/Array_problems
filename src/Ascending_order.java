public class Ascending_order {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,3,2};
        for(int i=0;i<arr.length;i++){
            for(int j=0; j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]= temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
