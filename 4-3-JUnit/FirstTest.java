package junit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Ignore;
import org.junit.Test;

public class FirstTest 
{
	
	@Test
	@Ignore
	public void t1()
	{
		assertEquals(10,20);
		assertEquals(20, 40);
	}
	
	@Test
	public void t2()
	{
		assertEquals(10,10);
	}
	

}
