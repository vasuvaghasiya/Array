public class zig_zag_fashion {
    public static void main(String[] args) {
        int [][] mat= {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10,11,12}
        };
        int row=mat.length;
        int col=mat[0].length;
//        for (int r=0;r<row;r++){
//            if (r%2==1){
//                for (int c=col-1;c>=0;c--){
//                    System.out.print(mat[r][c]+" ");
//                }
//            }
//            else{
//                for (int c=0;c<col;c++){
//                    System.out.print(mat[r][c] + " ");
//                }
//            }
//            System.out.println();
//        }

        //optimize solution.
        for (int r=0;r<row;r++){
            for (int c=0;c<col;c++){
                if(r%2==0){
                    System.out.print(mat[r][c] + " ");
                }
                else {
                    System.out.print(mat[r][col-c-1]+ " ");
                }
            }
            System.out.println();
        }


    }
}
