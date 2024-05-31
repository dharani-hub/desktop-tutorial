import java.util.ArrayList;

public class LoopsExample7 {

	public static void main(String[] args) {
		ArrayList<Character> values =  new ArrayList<>();
		values.add('A');
		values.add('B');
		values.add('C');
		values.add('D');
		values.add('E');
		int count = values.size();
		System.out.println("size of the arraylist :" + count);
		for(int i=0;i<count;i++) {
System.out.println(values.get(i));
		

	}

}
}