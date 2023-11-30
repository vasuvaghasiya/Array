public class Delete_max_element_from_each_col {
    public static void main(String[] args) {
        int [][] mat={
                {1,3,5,2,4},
                {6,2,3,2,5},
                {1,2,3,4,8}
        };

        int rows=mat.length;
        int cols=mat[0].length;

        for (int r=0;r<cols;r++) {
            int maxIndex = 0;
            for (int c = 1; c < rows; c++)
                if (mat[c][r] > mat[maxIndex][r]) {
                    maxIndex = c;
                }

            for (int i = maxIndex; i < rows-1; i++) {
                mat[i][r] = mat[i+1][r];
            }
        }
        rows--;

        for (int r=0;r<rows;r++){
            for (int c=0;c<cols;c++){
                System.out.print(mat[r][c]+ " ");
            }
            System.out.println();
        }

    }
}
