package Array;

public class Array3 {
	public static void sumofEvenDigits(int[] a) {
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0)
			System.out.println(a[i]+" ");
			
		}
		
	}

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8,10};
		sumofEvenDigits(arr);

	}

}
