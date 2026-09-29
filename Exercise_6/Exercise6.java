package Exercise_6;

import Exercise_1.Exercise1;

public class Exercise6{
    public static int medianArrray(int[] L){
        int n = L.length;
        int[] sorted = Exercise1.sortIntegers(L);
        return sorted[(n-1)/2];
    }
    public static void main(String[] args){
        int[] A ={5,4,7,2,1};
        System.out.println(medianArrray(A));
    }
}