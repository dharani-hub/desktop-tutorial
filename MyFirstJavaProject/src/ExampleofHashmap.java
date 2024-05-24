
import java.util.HashMap;


public class ExampleofHashmap {

	public static void main(String[] args) {
	HashMap<String,String> studeDetails = new HashMap<String, String>();
	studeDetails.put("rollno01","Kishore");
	String Result = studeDetails.get("rollno01"); 
	System.out.println(Result);
	studeDetails.put("rollno02", "Arun");
	 Result = studeDetails.get("rollno02");
	 System.out.println(Result);
	 
	 // a=23 b=34 ->o/p a=34,b=23

	}

}
