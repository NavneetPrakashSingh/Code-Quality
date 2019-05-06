package Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class TestSum {
	
	static MockSum mockSum; 
	@BeforeAll
	static void setUpBeforeClass()
	{
		mockSum = new MockSum();
	}
	
	@Test
	void TestForPositiveNegativeSum() {
		int sum = mockSum.loadObject(0).getFirstValue() + mockSum.loadObject(0).getSecondValue();
		assertEquals(sum, 0);
	}
	
	@Test
	void TestForZeroSum() {
		int sum = mockSum.loadObject(1).getFirstValue() + mockSum.loadObject(1).getSecondValue();
		assertEquals(sum, 0);
	}
	
	@Test
	void TestForPositiveSum() {
		int sum = mockSum.loadObject(2).getFirstValue() + mockSum.loadObject(2).getSecondValue();
		assertEquals(sum, 0);
	}
	
	@Test
	void TestForNegativeSum() {
		int sum = mockSum.loadObject(3).getFirstValue() + mockSum.loadObject(3).getSecondValue();
		assertEquals(sum, 0);
	}
}
