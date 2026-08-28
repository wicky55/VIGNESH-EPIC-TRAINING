

public class Alpha {

	public static void main(String[] args) {
		int[] arr= {12,8,7,4,25,18,17};
		int n = arr.length;
		for(int i=0;i<n;i++){
		    for(int j=i+n;j<n;j++){
		        if(arr[j]>arr[i]){
		            int temp = arr[i];
		            arr[i] = arr[j];
		            arr[j] = temp;
		        }
		    }
		}
		for(int i=0;i<n;i++){
		    System.out.print(arr[i]+" ");
		}
		

	}

}
//to arrange eve index in dec and odd index in asc home work