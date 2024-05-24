//String a="Apple" 0=A 1=p 2=p 3=l 4=e
public class reverseTheString {

	public static void main(String[] args) {
		String a="Apple";
		String b="";
		int count= a.length()-1;//4
		for(int i=count;i>=0;i--) {
			System.out.println(a.charAt(i));
			b =b+a.charAt(i);
			
			
			
		}
		System.out.println(b);
		

	}

}

