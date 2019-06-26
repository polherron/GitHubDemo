import static org.junit.Assert.*;

import org.junit.Test;

public class MathsHelperTests {

	@Test
	public void testAdd() {
		
		int actual = MathsHelper.add(2,3);
		int expected = 5;
		assertEquals(actual, expected);		
	}
	
	@Test
	public void testAddLarge() {
		
		int actual = MathsHelper.add(101,3);
		int expected = 104;
		assertEquals(actual, expected);		
	}
	@Test
	public void testSub() {
		
		int actual = MathsHelper.sub(2,3);
		int expected = 1;
		assertEquals(actual, expected);		
	}
	
	
	

}
