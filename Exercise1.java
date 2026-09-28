public class Exercise1{
    public static int[] sortIntegers(int[] unsorted){
        int n = unsorted.length;
        int[] sorted = new int[n];
        for(int k=0;k<n;k++){
            sorted[k]=unsorted[k];
        }
        for (int i=0;i<n-1;i++){
            for (int j=i+1;j<n;j++){
                if(sorted[j]>sorted[i]){
                    int temp = sorted[i];
                    sorted[i]=sorted[j];
                    sorted[j]=temp;
                }
            }
        }
        return sorted;
    }
    public static void printArray(int[] A){
        

    }
}