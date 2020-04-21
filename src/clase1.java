import java.util.Scanner;
public class clase1 {

	public static void main (String[]args) {
		
		int [] num = new int [5];
		System.out.println(Contar(num));
		
	}
	
		public static int Contar(int num []) {
		Scanner sc = new Scanner(System.in);
		int contador = 0;
		for(int i = 0; i<num.length; i++) {
			 num[i]=sc.nextInt();
	            if(num[i]%10 == 3) {
	                System.out.println(num[i]+ " acaba en 3");
	                contador++;
	            }
	}
		return contador;
	}
}
