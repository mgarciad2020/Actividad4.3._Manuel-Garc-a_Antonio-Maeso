import java.util.Scanner;
public class clase1 {

	public static void main (String[]args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int [] num = new int [a];
		Contar(num, a, sc);
		
	}
	
	public static void Contar (int [] num, int a, Scanner sc) {
		 for(int i = 0; i<num.length; i++) {
			 num[i]=sc.nextInt();
	            if(num[i]%10 == 3) {
	                System.out.println(num[i]+ " acaba en 3");
	            }
	}
	}
}