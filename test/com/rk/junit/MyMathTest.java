package com.rk.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyMathTest {

	@Test
	void test() {
		
		int[] num = {1,2,3};
		MyMath math = new MyMath();
		int result = math.calculateSum(num);
		int expResult = 6;
		assertEquals(expResult,result);
	}

}
