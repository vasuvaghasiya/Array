public class unique_element {
    public static void main(String [] args){
        int [] arr = {10,20,100,40,50};
        int unique=10,count=0;
        for (int i=0 ;i < arr.length; i++){
            if(arr[i]==unique){
                count++;
            }
        }
        if (count>1){
            System.out.println("element is not unique");
        }
        else {
            System.out.println("elemenet is unique ");
        }
    }
}
