public class arr_copy_two_time_in_new_arr {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int n=arr.length;
        int newarr[]=new int[n*2];

        for (int i=0;i<n;i++){
            newarr[i]=arr[i];
            newarr[n+i]=arr[i];
        }
        for (int i=0;i<newarr.length;i++){
            System.out.print(newarr[i]+" ");
        }
    }
}
