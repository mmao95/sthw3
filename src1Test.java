package lab1source;

import static org.junit.Assert.*;

import org.junit.Test;

public class src1Test {
    src1 s1= new src1();
	@Test
	public void testT() {
		assertEquals("equilateral triangle",s1.T(3,3,3));
		assertEquals("isosceles triangle",s1.T(3,4,3));
		assertEquals("scalene triangle",s1.T(3,4,5));
	}

}
