import java.util.Arrays;

public class Exercise2{
    public static void reverseArray(int[] L){
        int n = L.length;
        System.out.println(Arrays.toString(L));
        for(int i=0;i<n/2;i++){
            int temp=L[n-i-1];
            L[n-1-i]=L[i];
            L[i]=temp;
        }
        System.out.println(Arrays.toString(L));
    }
    public static void main(String[] args){
        int[] L = {5,4,3,2};
        reverseArray(L);
    }
}