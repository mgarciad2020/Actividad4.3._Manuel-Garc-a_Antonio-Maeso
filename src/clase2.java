import java.util.Scanner;
public class clase {

	public static void main (String[]args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Tama�o array");
		int a = sc.nextInt();
		int [] num = new int [a];
		Media(num, a, sc);
		
	}
	
	public static void Media (int [] num, int a, Scanner sc) {
		int media=0;
		int b=0;
		for(int i = 0; i<num.length; i++) {
			 System.out.println("Introduce los n�meros");
			 num[i]=sc.nextInt();
			 b=b+num[i];
		 }
		media=b/num.length;
		 System.out.println(media);
	}
}
