import java.util.ArrayList;

public class sampleProject {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(20);
		numbers.add(10);
		numbers.add(30);
		
	System.out.println(numbers.get(2));
	
	//Arraylistname.size();
	
	int sizeOftheArraylist = numbers.size();
	System.out.println(sizeOftheArraylist);
	
	//Arraylistname.remove(index)
	
	numbers.remove(1);
	
	int afterRemovingSizeOfTheArraylist = numbers.size();
	System.out.println(afterRemovingSizeOfTheArraylist);
	
	
	
	int b = numbers.get(0)+ numbers.get(1);
	System.out.println(b);
	
	}

}