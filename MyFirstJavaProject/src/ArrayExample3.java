
public class ArrayExample3 {

	public static void main(String[] args) {
		int a[]= {1,10,4,5};
		int b[]= {1,10,4,5};
		int lengthofthearray=a.length;
		int lengthofthebarray=b.length;
		if(lengthofthearray==lengthofthebarray) {
			for(int i=0;i<lengthofthearray;i++) {
				if(a[i]==b[i]) {
					System.out.println(a[i]+"present in b array as well as a array");
				}
				
			}
			
		}

	}

}
