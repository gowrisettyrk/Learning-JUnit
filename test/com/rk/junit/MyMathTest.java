package com.rk.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyMathTest {
	
	private MyMath math = new MyMath();

	@Test
	void calcucalteSum_ThreeMemberArray() {
		assertEquals(6,math.calculateSum(new int[] {1,2,3}));
	}
	
	@Test
	void calculateSum_NullArray() {
		assertEquals(0,math.calculateSum(new int[] {}));
	}

}
