package Array;

public class DeepCopy {

	public static void main(String[] args) {
           int a[] = {1,2,3,4};
           int b[] = a.clone();
           for(int i=0;i<b.length;i++) {
        	   System.out.println(b[i]);
           }
           b[0]++;
           for(int i=0;i<a.length;i++) {
        	   System.out.println(a[i]);
           }
           System.out.println();
           
           b[0]++;
           for(int i=0;i<b.length;i++) {
        	   System.out.println(b[i]+" ===============");
	}
           b[0]++;
           for(int i=0;i<b.length;i++) {
        	   System.out.println(b[i]+"=============== ");
	}
	}
}