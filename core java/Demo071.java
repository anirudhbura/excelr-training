public class Demo071 {
    public static void main(String[] args) {
        int[] array = { 4, 2, 5, 77, 14, 25 };
        int n = array.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = array[i];
            array[i] = array[n - i - 1];
            array[n - i - 1] = temp;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }
}