
public class Array {

	public static void main(String[] args) {
		//Syntax : datatype[] arrayname = new datatype[size];
		int[] numbers = new int[5];
		
		
		numbers[0]=10;
		numbers[1]=20;
		numbers[2]=30;
		numbers[3]=40;
		numbers[4]=50;
		System.out.println(numbers[4]);
		int b = numbers[0]+numbers[1]+numbers[2]+numbers[3]+numbers[4];
		System.out.println(b);
		int c = b%2;
		if (c==0) {
			System.out.println("b is even number");
			
		}
		else
		{
			System.out.println("b is not even number");
		}
		
	}

}
