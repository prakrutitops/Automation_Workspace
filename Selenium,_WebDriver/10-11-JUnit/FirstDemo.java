import static org.junit.Assert.fail;

import org.junit.Test;

public class FirstDemo 
{
	
	@Test
	public void passTest()
	{
		System.out.println("This Testcase is passed");
	}
	
	@Test
	public void failTest()
	{
		System.out.println("This Testcase is Fail");
		fail();
	}
	
}
