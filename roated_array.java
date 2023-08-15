import java.util.Arrays;

public class roated_array {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        int d = 4;
        d = d % arr.length;

        for (int i=1;i<=d;i++){
            int temp = arr[0];
            for (int j=0;j<arr.length-1;j++){
                arr[j]=arr[j+1];
            }
            arr[arr.length-1]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
