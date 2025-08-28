package test;

import org.testng.annotations.Test;

public class ClassB {
	
	
	public class classB {
		
		@Test
		public void testcase5() {
			System.out.println("Test case5 Done:" + Thread.currentThread().getId());
		}
		@Test
		public void testcase6() {
			System.out.println("Test case6 Done: " + Thread.currentThread().getId());
		}

}
}            
