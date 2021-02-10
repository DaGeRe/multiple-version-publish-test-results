package de.peass;

import org.junit.Assert;
import org.junit.Test;


public class Test1 {
	
	@Test
	public void testCorrect(){
		System.out.println("Some output");
		
		Assert.assertTrue(true);
	}
	
	@Test
   public void testFail(){
      System.out.println("Some fail output");
      
      Assert.assertTrue(false);
   }
}
