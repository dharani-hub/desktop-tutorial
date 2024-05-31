
public class PalindromeEg2 {

	public static void main(String[] args) {
		int input=242;
		int num=input;
		int rev=0;
		while(num!=0) {
			rev=rev*10+num%10;
			num=num/10;
			
		}
		System.out.println(rev);
		if(input==rev) {
			System.out.println(input+"is a palindrome");
		}
		else {
			System.out.println(input +"is not a palindrome");
		}

	}

}



