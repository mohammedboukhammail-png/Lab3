public class Exercise4 {
    public static int[][] reverseColumn(int[][] A){
        for(int i=0;i<6;i++){
            A[i][4]=A[i][1];
        }
        return A;
    }
}