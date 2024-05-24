
public class ExceptionHandling {

	public static void main(String[] args) {
		String a ="Apple";
		try {
			System.out.println(a.charAt(100));
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}
		System.out.println("Hello");

	}

}
