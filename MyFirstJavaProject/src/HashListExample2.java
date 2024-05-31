import java.util.HashMap;
import java.util.ArrayList;
public class HashListExample2 {

	public static void main(String[] args) {
		HashMap<String,ArrayList<String>> StudentDet = new HashMap<String,ArrayList<String>>();
		
		ArrayList<String> rollno1_details= new ArrayList<String>();
		rollno1_details.add("abc");
		rollno1_details.add("20");
		
		
		StudentDet.put("rollno1", rollno1_details);
		
		System.out.println(StudentDet.get("rollno1"));

	}

}
