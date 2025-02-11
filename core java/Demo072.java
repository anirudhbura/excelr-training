import java.util.Scanner;

public class Demo072{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter size of an array: ");
    int n = sc.nextInt();
    
    System.out.print("Enter elements in an array: ");
    int array[] = new int[n];

    for(int i=0;i<n;i++){
        array[i]=sc.nextInt();
    }
    System.out.print("Enter Element to search: ");
    int element = sc.nextInt();
    int index = -1;
   for(int i=0;i<n;i++){
    if(array[i]==element){ 
       index = i;
        break;
    }
}
if(index != -1){
    System.out.println("Element found at: "+index);
}
else{
    System.out.println("-1");
}
sc.close();
}
}