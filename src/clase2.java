import java.util.Scanner;
/**
 * 
 * @author Maeso
 *
 */
public class clase2 {

	/**
	 * 
	 * @param args
	 * Llama a la función media, que calcula la media de los números dentro de "num".
	 */
	public static void main (String[]args) {
		
		int [] num = new int [9];
		System.out.println(Media(num));
		
	}
	
	/**
	 * Esta función nos permite introducir números y calcular la media de dichos números.
	 * @param num array en el que introduciremos los números de los que queremos saber la media.
	 * @return retorna el valor de la variable "media".
	 */
	public static int Media (int [] num) {
		int media=0;
		int b=0;
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i<num.length; i++) {
			 System.out.println("Introduce los nÃºmeros");
			 num[i]=sc.nextInt();
			 b=b+num[i];
		 }
		media=b/num.length;
		return media;
	
	}
}
