public class Delete_max_element_from_each_row {
    public static void main(String[] args) {
        int [][] mat={
            {1,3,5,2,1},
            {6,2,3,2,1},
            {1,2,3,4,8}
        };

        int rows=mat.length;
        int cols=mat[0].length;

        for (int r=0;r<rows;r++) {
            int maxIndex = 0;
            for (int c = 1; c < cols; c++)
                if (mat[r][c] > mat[r][maxIndex]) {
                    maxIndex = c;
                }

            for (int i = maxIndex; i < cols-1; i++) {
                mat[r][i] = mat[r][i + 1];
            }
        }
        cols--;

        for (int r=0;r<rows;r++){
             for (int c=0;c<cols;c++){
                  System.out.print(mat[r][c]+ " ");
             }
             System.out.println();
        }



    }
}
