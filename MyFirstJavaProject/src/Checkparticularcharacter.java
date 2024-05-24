
public class Checkparticularcharacter {

	public static void main(String[] args) {
		String a="Apple";
		char c = 'e';
		for(int i=0;i<a.length();i++) {
			char b = a.charAt(i);
			if(b==c) {
				System.out.println(a+" Contains letter "+c);
			}
		}

	}

}
