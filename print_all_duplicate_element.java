public class print_all_duplicate_element {
    public static void main(String [] args){
        int [] arr = {10,20,10,20,50,50,70};

        for (int i=0 ;i < arr.length; i++){
            if (arr[i]<0){
                continue;
            }
            int count=0;
            for (int j=i+1;j<arr.length;j++) {

                if (arr[i] == arr[j]) {
                    count++;
                    arr[j]*= -1;
                }

            }
            if(count>=1){
                System.out.print( arr[i]+" ");
            }
        }

    }
}
