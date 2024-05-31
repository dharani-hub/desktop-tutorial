
public class reverseTheString2eg {

	public static void main(String[] args) {
		String a="Software Testing Help";
		String b="";
		int count= a.length()-1;//4
		for(int i=count;i>=0;i--) {
			System.out.println(a.charAt(i));
			b =b+a.charAt(i);
			
			
			
		}
		System.out.println(b);
		

	}

}
