
public class method9Example {

	public static void main(String[] args) {
		method9Example obj = new method9Example();
		obj.print(3);

	}
	public void print(int a) {
		int c = a%2;
		if(c==0) {
			System.out.println("a is even number");
			
		}
		else {
			System.out.println("a is not even number");
		}
	}

}
