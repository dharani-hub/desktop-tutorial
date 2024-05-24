import java.util.HashMap;
import java.util.ArrayList;

public class Hashmapexample {

	public static void main(String[] args) {
		//Declaration
		HashMap<String, ArrayList<String>> studentDetails = new HashMap<String, ArrayList<String>>();
		ArrayList<String> rollno1Details = new ArrayList<String>();
		rollno1Details.add("abc");
		rollno1Details.add("20");
		studentDetails.put("rollno1", rollno1Details);
		ArrayList<String> rollno2Details = new ArrayList<String>();
		rollno2Details.add("def");
		rollno2Details.add("50");
		studentDetails.put("rollno2", rollno2Details);
		System.out.println(studentDetails.get("rollno1"));
		System.out.println(studentDetails.get("rollno2"));
		
		
		
		
		
		
		
		
		

	}

}
