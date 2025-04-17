//5.	Write a program to count the occurrence of each element in the array.

import java.util.Arrays;

public class CountOfOccurence {
    public static void main(String[] args) {
        int[] arr = { 2, 2, 4, 2, 3, 1, 5 };

        int[] freq = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }

        for(int i=0; i<freq.length; i++){
            System.out.println("The count of element " + i + " is " + freq[i]);
        }
        // System.out.println(Arrays.toString(freq));
    }
}
