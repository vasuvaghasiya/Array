public class Column_wise_traversal {
        public static void main(String[] args) {
            int [][] mat= {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
            int row=mat.length;
            int col=mat[0].length;
            for (int r=0;r<col;r++){
                for (int c=0;c<row;c++){
                    System.out.print(mat[c][r]+ " ");
                }
                System.out.println();
            }
        }
}
