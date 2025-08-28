package test;

import org.testng.annotations.Test;

public class classA {
	
	@Test
	public void testcase3() {
		System.out.println("Test case3 Done:" + Thread.currentThread().getId());
	}
	@Test
	public void testcase4() {
		System.out.println("Test case4 Done: " + Thread.currentThread().getId());
	}

}
