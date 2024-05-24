
public class stringOperation_contains {

	public static void main(String[] args) {
		//contains-> if particular word is exist in the string or not
				String a = "Hellohai World Hello";
				boolean res=a.contains("World");
				boolean res1=a.contains("world");
				System.out.println(res);
				System.out.println(res1);
				if(a.contains("World")) {
					System.out.println("contains the word World");
				}
					else {
						
						System.out.println("Doesnt contains the word World");
					}
				}

	}


