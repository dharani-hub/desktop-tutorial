
public class Palindrome {

	public static void main(String[] args) {
		String a = "Level";
		String b="";
		int count= a.length()-1; //4
		for(int i=count;i>=0;i--) {
			System.out.println(a.charAt(i));
			b =b+a.charAt(i);

	}
		if(a.equalsIgnoreCase(b)) {
			System.out.println(a+" Is a palindrome");
		}

}
}
