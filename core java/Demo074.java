import java.util.Scanner;

public class Demo074 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter size of an array: ");
        int n = sc.nextInt();
        System.out.print("Enter elements in an array: ");
        int array[] = new int[n];
        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i]>array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;

                }
            }
            System.out.println(array[i]);
        }
      
        sc.close();
    }
}