//3.	Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.(with function)

import java.util.Arrays;

public class Intersection {
    public static void main(String[] args) {
        int arr1[] = {4,2,1,5,6,1};
        int arr2[] = {6,2,1,3,6,9};

        int[] result = new int[arr1.length];
        int index = 0;

        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr2.length; j++){
                if (arr1[i]==arr2[j]) {
                    result[index++] = arr1[i];
                }
            }
        }

        System.out.println(Arrays.toString(result));

    }
}
