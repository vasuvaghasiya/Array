
/*
perform operation like insert ,print,find ,update ,size,delete,is empty
*/

public class array_operation_program {
    public static void main(String [] args){
        int a[] = new int[5];
        int p=0;
        System.out.println("array is empty" + " "+ isempty(p));
        p=insert(a,p,10);
        p=insert(a,p,12);
        p=insert(a,p,13);
        p=insert(a,p,150);
        p=insert(a,p,190);
        System.out.println(p);
//        print(a,p);
//        find(a,p,10);
//        update(a,p,190,100);
//        print(a,p);
//        System.out.println();
//        System.out.println("size of array is :-" + size(p));
//        System.out.println(isempty(p));
        p=delete(a,p,12);
        System.out.println(p);
        print(a,p);
    }
    private static int insert(int arr[],int p,int val){
        if(arr[p]==arr.length){
            System.out.println("Array is full ");
            return p;
        }
        arr[p]=val;
        p++;
        return p;
    }
    private static void print(int arr[],int p){
        for(int i=0;i<p;i++){
            System.out.print(arr[i] + " ");
        }

    }

    private static void  find(int arr[] , int p, int val){
        for (int i=0;i<p;i++)
        {
            if(arr[i]==val){
                System.out.println();
                System.out.println("element is present");
                return;
            }
        }
        System.out.println("element is not present");
    }
    private static void update(int arr[],int p,int oldv, int newv){
        for (int i=0;i<p;i++){
            if(arr[i]==oldv){
                arr[i]=newv;
            }
        }

    }
    private static int size(int sizeofarr){
        return sizeofarr;
    }

    private static boolean isempty(int p){
        if(p==0) {
            return true;
        }
            return false;
    }
    private static int delete(int arr[],int p,int val){
        for (int i=0;i<p;i++){
            if(arr[i]==val){
                for (int j=i;j<p-1;j++){
                    arr[j]=arr[j+1];
                }
                p--;
            }
        }
        return p;
    }

}