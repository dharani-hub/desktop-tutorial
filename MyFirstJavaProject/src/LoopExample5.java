import java.util.ArrayList;
public class LoopExample5 {

	public static void main(String[] args) {
		ArrayList <String> fruits = new ArrayList<>();//ArrayList Declaration
		fruits.add("Apple");//0
		fruits.add("Grapes");//1
		fruits.add("jack fruit");//2
		fruits.add("dragon fruit");//3
		fruits.add("Pineapple");//
		int count = fruits.size();
		System.out.println("size of the arraylist :" + count);
		for(int i=0;i<count;i++) {
 System.out.println(fruits.get(i));
	}

}
}
