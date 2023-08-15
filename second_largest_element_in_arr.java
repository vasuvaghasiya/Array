
public class second_largest_element_in_arr{
	public static int findSecondLargest(int[] arr) {
		int max1=Integer.MIN_VALUE;
		int max2=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++){
			if(arr[i]>max1)
			{
				max2=max1;
				max1=arr[i];
			}
			else if(arr[i]>max2){
				max2=arr[i];
			}
			
		}
		if(max2==Integer.MIN_VALUE)
			return -1;
		else
			return max2;

	}
	public static void main(String [] args){
		int arr [] = {-1,-5,2,3,9};
		System.out.println(findSecondLargest(arr));
	}
}
