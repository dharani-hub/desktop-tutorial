
public class ArrayExample4 {

	public static void main(String[] args) {
		int a[]= {1,10,4,5};
		int b[]= {1,10,4,5,9,10};
		int lengthofthearray=a.length; //4
		int lengthofthebarray=b.length; //6
			for(int i=0;i<lengthofthearray;i++) {
					for(int j=0;j<lengthofthebarray;j++) {
						
						if(a[i]==b[j]) {
							System.out.println("Duplicate element present in b array is "+b[i]);
						}
					}
				}			
		}

	}
