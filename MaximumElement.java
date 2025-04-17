public class MaximumElement {
    public static void main(String[] args) {
        int arr[] = { 1, 3, -1, 5, 4, 6 };
        int n = arr.length;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("The maximum element in the array " + max);
    }
}
