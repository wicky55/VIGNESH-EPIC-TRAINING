
import java.util.Scanner;
public class occurance {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the size of array: ");
	        int size = sc.nextInt();
	        int[] arr = new int[size];
	        System.out.println("Enter the array elements:");
	        for (int i = 0; i < size; i++) {
	            arr[i] = sc.nextInt();
	        }
	        for (int i = 0; i < size; i++) {
	            int count = 1;
	            boolean counted = false;
	            for (int k = 0; k < i; k++) {
	                if (arr[i] == arr[k]) {
	                    counted = true;
	                    break;
	                }
	            }
	            if (counted)
	                continue;
	            for (int j = i + 1; j < size; j++) {
	                if (arr[i] == arr[j]) {
	                    count++;
	                }
	            }

	            System.out.println(arr[i] + "=" +count );
	        }
	    }
	}

