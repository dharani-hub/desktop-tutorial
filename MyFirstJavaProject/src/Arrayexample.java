

public class Arrayexample {

	public static void main(String[] args) {
		int[] a = {1,5,7,8};
		
		int[] b= new int [4];
		int lengthOfTheArray = a.length;
		for(int i=0;i<lengthOfTheArray;i++) {
			b[i]=a[i];
			
		}

		for(int i=0;i<lengthOfTheArray;i++) {
			System.out.println(b[i]);
		}

		}
	}
	
