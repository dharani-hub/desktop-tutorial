import java.util.ArrayList;

public class LoopsExample8 {
public static void main(String[] args) {
		String a = "Pineapple";
		boolean elementPresent = false;
		ArrayList <String> fruits = new ArrayList<>();
		fruits.add("Apple");//0
		fruits.add("Grapes");//1
		fruits.add("jack fruit");//2
		fruits.add("dragon fruit");//3
		fruits.add("Pineapple");//
		
		int count = fruits.size();
		System.out.println("size of the arraylist :" + count);
		for(int i=0;i<count;i++) {
			if(fruits.get(i).equals(a)) {
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


