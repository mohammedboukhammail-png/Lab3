import java.util.Arrays;
public class Exercise3 {
    public static int[][] jaggedArray(int n){
        int[][] L= new int[n][];
        int compteur=1;
        for(int i=0;i<n;i++){
            int[] S = new int[i+1];
            for(int j=0;j<i+1;j++){
                S[j]=compteur;
                compteur++;
            }
            L[i]=S;
        }
        return L;
    }
    public static void main(String[] args){
        int[][] A = jaggedArray(5);
        for (int[] ligne : A){
            System.out.println(Arrays.toString(ligne));
        }
    }

}