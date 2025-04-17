//2.	Given an integer N and an array of size N-1 containing N-1 numbers between 1 to N. Find the number(between 1 to N), that is not present in the given array.(Find the missing element of the array)
public class MissingElement {
    public static void main(String[] args) {
        int n = 6;
        int arr[] =  {1,2,4,3,6};

        int sum = n*(n+1)/2;
        int sumOfArray = 0;
        for(int i=0; i<arr.length; i++){
            sumOfArray += arr[i];
        }

        int missingNumber = sum - sumOfArray;
        System.out.println("The missing element in the array is " + missingNumber);
    }
}
