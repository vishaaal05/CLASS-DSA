public class Print {

    public static void print(int n) {
        if (n == 0) {
            return;
        }
        print(n - 1);
        System.out.println(n-1);
    }

    public static void main(String[] args) {
        print(10);
    }
}
