
public class ArrayExample6 {

	public static void main(String[] args) {
		//find duplicate from the array
		int a[]= {1,10,4,5,10};
		int count =a.length;
		for(int i=0;i<count;i++) {
			for(int j=i+1;j<count;j++) {
				if(a[i]==a[j]) {
					System.out.println("duplicated element in array are" + a[j]);
					
				}
				
			}
		}
	}

}
