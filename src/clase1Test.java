import static org.junit.Assert.*;

import org.junit.Test;

public class clase1Test {

	@Test
	public void test() {
		int[] num = { 3, 8, 23, 50, 90};
		int a = clase1.Contar(num);
		assertEquals(2,a);
	}

}
