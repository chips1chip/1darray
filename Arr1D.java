
import java.util.Scanner;

public class Arr1D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements: ");
        int numElements = sc.nextInt(); 
        int[] arr = new int[numElements]; // Initialize array
        System.out.println("Enter elements: ");
        
        for (int i = 0; i < numElements; i++) {
            arr[i] = sc.nextInt(); // Input array elements
        }
        
        System.out.println("The elements of the array are: ");
        for (int i = 0; i < numElements; i++) {
            System.out.println(arr[i] + " "); // Print each element
        }
        
        sc.close(); 
    }
}
