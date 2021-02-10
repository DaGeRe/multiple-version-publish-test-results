package de.peass;

import org.junit.Assert;
import org.junit.Test;


public class Test2 {
	
	@Test
	public void testCorrect(){
		System.out.println("Some output");
		
		Assert.assertTrue(true);
	}
	
	@Test
   public void testCorrect2(){
      System.out.println("Some correct2 output");
      
      Assert.assertTrue(true);
   }
}
