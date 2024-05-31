
public class ArrayExample2 {

	public static void main(String[] args) {
         int[] a = {1,5,7,8};//0=1,1=5,2=7,3=8
		
		int[] b= new int [4];//0= ,1= ,2= ,3=
		System.out.println(b[0]);
		System.out.println(b[1]);
		System.out.println(b[2]);
		System.out.println(b[3]);
		b[0]=a[0];
		b[1]=a[1];
		b[2]=a[2];
		b[3]=a[3];
		System.out.println(b[0]);
		System.out.println(b[1]);
		System.out.println(b[2]);
		System.out.println(b[3]);
		
	}

}
