
public class method6Example {

	public static void main(String[] args) {
		method6Example obj= new method6Example();
		obj.calculator("Addition",2,3);
		obj.calculator("Subtraction",30,20);
		obj.calculator("Multiplication",10,3);
	}
	public void calculator(String options, int a, int b) {
		int result;
		switch(options) {
		case "Addition":
			result=a+b;
			System.out.println("Addition result : "+result );
			break;
		case "Subtraction":
			result=a-b;
			System.out.println("Subtraction result : "+result );
			break;
		case "Multiplication":
			result=a*b;
			System.out.println("Multiplication result : "+result );
			break;
			
		}
	}

}
