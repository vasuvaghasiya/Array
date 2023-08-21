public class Print_diagonal_elements {
    public static void main(String[] args) {
        int [][] mat= {
                {2,5,0},
                {4,4,6},
                {7,2,5}
        };
        //left top  to right bottom.
//        int row= mat.length;
//        for (int r=0;r<row;r++){
//            System.out.println(mat[r][r]);
//        }
        //right bottom to left top
        int row= mat.length;
        for (int r=0;r<row;r++){
            System.out.println(mat[r][row-r-1]);
        }
    }

}
