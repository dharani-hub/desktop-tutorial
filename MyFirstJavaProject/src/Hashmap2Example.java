import java.util.HashMap;
import java.util.ArrayList;
public class Hashmap2Example {

	public static void main(String[] args) {
		//Declaration
		HashMap<String, ArrayList<String>> Map = new HashMap<String, ArrayList<String>>();
		ArrayList<String> A = new ArrayList<String>();
		A.add("Apple");
		A.add("Aeroplane");
		Map.put("A", A);
		ArrayList<String> B = new ArrayList<String>();
		B.add("Bat");
		B.add("Banana");
		Map.put("B", B);
		ArrayList<String> C = new ArrayList<String>();
		C.add("Cat");
		C.add("Car");
		Map.put("C", C);
		System.out.println(Map.get("A"));
		System.out.println(Map.get("B"));
		System.out.println(Map.get("C"));
		
				   }  

	}


