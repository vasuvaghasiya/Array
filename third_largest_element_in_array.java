public class third_largest_element_in_array {
    public static void main(String[] args) {
        int arr[] = {1,8,6,2,10,9};
        int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max) {
                max2=max;
                max = arr[i];
            }
            else if (arr[i]>max2) {
                max3=max2;
                max2=arr[i];
            }
            else if(arr[i]>max3){
                max3=arr[i];
            }
        }
        System.out.println(max3);
    }
}
