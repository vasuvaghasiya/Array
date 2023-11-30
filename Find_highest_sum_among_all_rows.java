public class Find_highest_sum_among_all_rows {
    public static void main(String[] args) {
        int [][] mat={{1,2,4},{5,6,7},{8,3,5},{9,1,0}};

        int row=mat.length;
        int col=mat[0].length;
        int max=Integer.MIN_VALUE;
        for(int r=0;r<row;r++){
            int sum=0;
            for (int c=0;c<col;c++){
                sum+=mat[r][c];
            }
            if(sum>max) {
                max = sum;
            }
        }
        System.out.println(max);

    }

}
