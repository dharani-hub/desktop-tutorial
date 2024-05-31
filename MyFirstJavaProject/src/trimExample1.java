
public class trimExample1 {

	public static void main(String[] args) {
		// trim() remove space from string front and back
		String a="Apple ";//6
		String b=" Peacock";//8	
        String c=" Hello ";//7
        System.out.println("length of a string :" + a.length());
        System.out.println("length of b string :" + b.length());
        System.out.println("length of c string :" + c.length());
        
        String d =a.trim();
        String e =b.trim();
        String f =c.trim();
        System.out.println("length of d string :" + d.length());//5
        System.out.println("length of e string :" + e.length());//7
        System.out.println("length of f string :" + f.length());//5
	}
	
	

}
