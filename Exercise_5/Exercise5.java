public class Exercise5 {
    public static int[][] matrixAdd(int[][] A,int[][] B){
        int n = A.length;
        int p =A[0].length;
        int[][] C = new int[n][p];
        for(int i=0;i<n;i++){
            for(int j=0;j<p;j++){
                C[i][j]= A[i][j] + B[i][j];
            }
        }
        return C;
    }
}