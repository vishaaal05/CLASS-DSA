public class DualSum {

    public static void main(String[] args) {
        int arr[] = {1,2,4,5,2,1,4};

        int target = 9;
        int count = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]+arr[j]==target){
                    count++;
                    System.out.println("Sum of element at index " + i + " and index " + j + " gives " + target);
                }
            }
        }

        System.out.println(count);
    }
}