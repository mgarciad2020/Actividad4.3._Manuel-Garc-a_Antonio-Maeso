import java.util.Scanner;
public class clase2 {

	public static void main (String[]args) {
		
		int [] num = new int [9];
		System.out.println(Media(num));
		
	}
	
	public static int Media (int [] num) {
		int media=0;
		int b=0;
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i<num.length; i++) {
			 System.out.println("Introduce los números");
			 num[i]=sc.nextInt();
			 b=b+num[i];
		 }
		media=b/num.length;
		return media;
	
	}
}
