
public class Exampleofvowels {

	public static void main(String[] args) {
		String a ="The best of both worlds";
		int count = a.length();
		//vowel=a,e,i,o,u
		char c[]= {'a','e','i','o','u'};	
		for(int i=0;i<count;i++) {
			char b = a.charAt(i);
			for(int j=0;j<c.length;j++) {
				if(b==c[j]) {
					System.out.println(b+"is a vowel");
				}
			}
		
		}

	}

}
