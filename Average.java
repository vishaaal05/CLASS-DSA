//6.	Given an array integer and find the average of all positive elements
public class Average {
    public static void main(String[] args) {
        int arr[]= {1,2,3,5,6,2,1};
        int n = arr.length;
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }

        float avg = (float)sum/n;

        System.out.println("Average of the array is " + avg);
    }
}
