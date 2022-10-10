package layoutPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CallingFunctionTest {
	@Test
	public void incrementTest() {
		var classTest = new CallingFunction(0);
		assertEquals(2,classTest.incrementCallFunction(1));
		assertEquals(3,classTest.incrementCallFunction(2));
		assertEquals(4,classTest.incrementCallFunction(3));
		assertEquals(5,classTest.incrementCallFunction(4));
		assertEquals(6,classTest.incrementCallFunction(5));
	}

	@Test
	public void decrementTest() {
		var classTest = new CallingFunction(0);
		assertEquals(1,classTest.decrementCallFunction(2));
		assertEquals(2,classTest.decrementCallFunction(3));
		assertEquals(3,classTest.decrementCallFunction(4));
		assertEquals(4,classTest.decrementCallFunction(5));
		assertEquals(5,classTest.decrementCallFunction(6));
	}
}
