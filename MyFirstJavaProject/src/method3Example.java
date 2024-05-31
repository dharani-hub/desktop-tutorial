
public class method3Example {

	public static void main(String[] args) {
		method3Example obj= new method3Example();
		obj.print();
		obj.add( 20,3);
		
	}
	public void print() {
		System.out.println("Hello world");
		
	}
	public void add(int a,int b) {
		int c=a+b;
		System.out.println(c);
	}

}
