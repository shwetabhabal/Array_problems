public class find_frequency_element {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,3,2};
        for(int i=0;i<arr.length;i++){
            int c=0;
            for(int j=0;j<arr.length;j++){

                if(arr[i]==arr[j]){
                    c++;
                }
            }
            System.out.println(arr[i]+"-"+c);
        }
    }
}
