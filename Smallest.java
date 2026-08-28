
import java.util.Scanner;
public class Smallest{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        
       
        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }
        
        for(int i=0;i<n-1;i++){
            int out=-1;
            for(int j=i+1;j<n;j++){
                
                if(arr[j]<arr[i]){
                    out = arr[j];
                    for(int k=j+1;k<n;k++){
                        if(arr[i]>arr[k] && arr[k]>out){
                            out= arr[k];
                        }
                    }
                    break;
                }
                
            }
            System.out.println(out);
        }
        System.out.println(-1);
    }
}
