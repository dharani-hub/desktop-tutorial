
public class ArrayExample8 {

	public static void main(String[] args) {
		String a="I am a good boy";// split
		//syntax= stringname.split(splitwise)
		
		String b[]=a.split(  " ");//b[0]=I b[1]=am b[2]=a b[3]=good b[4]=boy
		
		int lenghtOfTheArray = b.length;
		
		for(int i=0;i<lenghtOfTheArray;i++){
			System.out.println(b[i]);
		

	}

}
}
