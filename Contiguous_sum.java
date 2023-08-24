public class Contiguous_sum {
    public static void main(String[] args) {
        int arr[]={10,-10,-2,3,40,-5,-5};
        int current_sum=0,max=0;
        for(int i=0;i< arr.length;++i)
        {
            current_sum+=arr[i];
            if(current_sum>max)
            {
                max=current_sum;
            }
            if(current_sum<0)
            {
                current_sum=0;
            }
        }
        System.out.println(max);
    }
}
