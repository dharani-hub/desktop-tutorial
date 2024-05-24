
public class ArrayExample7 {

	public static void main(String[] args) {
		boolean flag=false;
		int a[]= {100,10,4,5,10};
		int count=a.length;
		for(int i=0;i<count;i++) {
			for(int j=i+1;j<count;j++) {
				if(a[i]>=a[j]) {
					flag=true;
					
				}
				else {
					flag=false;
					break;
					
				}
			}
			if (flag==true) {
				System.out.println("The greatest/largest number is" + a[i]);
				break;
			}
		}
		
	}

}
