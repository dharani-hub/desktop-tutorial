import java.util.HashMap;
public class Factors {

	
		 public static void main(String args[]){
		        HashMap<Character,Integer> countNoOfCharacter =  new HashMap<>();
		        String a = "Hello";
		        int count = a.length();
		        for(int i=0;i<count;i++) {
		            char characterToBeCounted = a.charAt(i);
		            if (countNoOfCharacter.get(characterToBeCounted) == null) {
		                int countcharacter = 1;
		                for (int j = i + 1; j < count; j++) {
		                    if (characterToBeCounted == a.charAt(j)) {
		                        countcharacter++;
		                    }
		                }
		                countNoOfCharacter.put(a.charAt(i), countcharacter);
		            }
		        }

		        System.out.println(countNoOfCharacter);
	}

}