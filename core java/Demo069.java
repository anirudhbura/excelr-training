import java.util.Scanner;

public class Demo069 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an array: ");
        int n = sc.nextInt();
        System.out.print("Enter Elements in an array: ");
        int array[] = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            sum += array[i];
        }
        System.out.println("sum of all the elements of an array: " + sum);
        sc.close();
    }
}