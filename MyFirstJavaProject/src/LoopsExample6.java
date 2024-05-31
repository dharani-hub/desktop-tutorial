import java.util.ArrayList;

public class LoopsExample6 {

	public static void main(String[] args) {
		ArrayList <Integer> numbers = new ArrayList<>();
		numbers.add(10);//0
		numbers.add(20);//1
		numbers.add(30);//2
		numbers.add(40);//3
		numbers.add(50);//4
		int count = numbers.size();
		System.out.println("size of the arraylist :" + count);
		for(int i=0;i<count;i++) {
 System.out.println(numbers.get(i));
	}

}


	}


