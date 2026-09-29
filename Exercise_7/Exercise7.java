package Exercise_7;

public class Exercise7{
    public static double stdev(int[] L){
        int n = L.length;
        double sum = 0;
        for(int i=0;i<n;i++){
            sum+=L[i];
        }
        double mean = sum/n;
        double sum1 = 0;
        for(int i=0;i<n;i++){
            double a=(L[i]-mean);
            sum1+=Math.pow(a,2);
        }
        return Math.pow(sum1/(n-1),0.5);
    }
    public static void main(String[] args){
        int[] A ={1,-2,4,-4,9,-6,16,-8,25,-10};
        System.out.println(stdev(A));
    }
}