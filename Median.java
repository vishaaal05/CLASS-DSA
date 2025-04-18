import java.util.Arrays;

public class Median {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5};
        int[] arr2 = {2, 4, 6,7};
        double median = 0;
        int[] merged = new int[arr1.length + arr2.length];
        int index = 0;
        for(int i=0; i<arr1.length; i++){
            merged[index] = arr1[i];
            index++;
        }

        for(int i=0; i<arr2.length; i++){
            merged[index] = arr2[i];
            index++;
        }

        Arrays.sort(merged);
        int n = merged.length;
        if (n%2==0) {
            float sum =  merged[(n/2)-1] + merged[(n/2)];
            median = sum/2.0;
        }else{
            median =merged[n/2] ;
        }

        System.out.println(median);
    }
}
