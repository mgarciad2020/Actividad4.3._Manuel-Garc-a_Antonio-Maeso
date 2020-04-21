import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class clase2Test {

	@Test
	public void intento1() {
		int[] num = { 9, 11, 3, 8, 5, 20, 12, 1, 89};
		int a = clase2.Media(num);
		assertEquals(17,a);			
	}
}
