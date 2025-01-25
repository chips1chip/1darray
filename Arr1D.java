import java.util.Scanner;
public class Arr1D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of elements: ");
        int n=sc.nextInt();
        int[] array=new int[n];
        System.out.println("Enter elements: ");
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("the elemens of the array are: ");
        for(int i=0;i<n;i++){
            System.out.println(array[i]+" ");
        }
        sc.close();
    }
}