
public class LoopsExample12 {

	public static void main(String[] args) {
		//compare two strings
		String a ="Apple";
		String b ="Orange";
		String c ="Apple";
		//equals(), equals ignore case-> true or false
		boolean res= a.equals(c);
		System.out.println(res);
		boolean res1= a.equals(b);
		System.out.println(res1);
		if(a.equals(b)) {
			System.out.println("a is equal to b");
			
		}
		else {
			System.out.println("a is not equal to b");
			
		}
		
	}

}
