public class Sum_of_all_diagonal_elements_in_matrix {
    public static void main(String[] args) {
        //(same position no allowed twice)
        int [][] mat= {
                {2,5,0},
                {4,4,6},
                {7,2,5}
        };



        int sum=0;
        for (int d=0;d<mat.length;d++){
            sum+=mat[d][d];

            if(d==mat.length-d-1){
                continue;
            }
            sum=sum+mat[d][mat.length-d-1];

        }
        System.out.println(sum);
    }
}
