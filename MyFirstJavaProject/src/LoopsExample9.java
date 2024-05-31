import java.util.ArrayList;

public class LoopsExample9 {

	public static void main(String[] args) {
		int a = 30;
		boolean elementPresent = false;
		ArrayList <Integer> numbers = new ArrayList<>();
		numbers.add(200);
		numbers.add(30);
		numbers.add(0);
		
		
		int count = numbers.size();
		System.out.println("size of arraylist:" + count);
		for(int i=0;i<count;i++) {
			if(numbers.get(i).equals(a)) {
 System.out.println("element is present");
 elementPresent = true;
 break;

	}

}
		if(elementPresent== false) {
			System.out.println("element is not present");
		}

	}

	

	}


