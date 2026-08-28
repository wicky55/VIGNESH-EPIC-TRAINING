
import java.util.Scanner;

public class Klargestnumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        // Descending Sort
        for(int i = 0; i < n - 1; i++) {
            for(int j = i + 1; j < n; j++) {

                if(arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.print(k + " Largest Elements: ");

        for(int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}