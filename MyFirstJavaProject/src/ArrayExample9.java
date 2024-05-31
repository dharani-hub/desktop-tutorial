
public class ArrayExample9 {

	public static void main(String[] args) {
		String a="Good_Begining Makes Good_Ending";
        String c=a.replace("_", " ");
        System.out.println(c);
		String b[]=c.split(" ");
	for(int i=0;i<b.length;i++){
			System.out.println(b[i]);

	}

}
}
