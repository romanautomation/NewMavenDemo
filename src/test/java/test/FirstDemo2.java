package test;





import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstDemo2 {

	@Test
	public void sum()
	{
		System.out.println("SUM2");
		int a=10;
		int b=20;
		Assert.assertEquals(30, a+b);
	}
	
	@Test
	public void sub()
	{
		System.out.println("SUB2");
		int a=20;
		int b=10;
		Assert.assertEquals(10, a-b);
	}
	
	@Test
	public void div()
	{
		System.out.println("DIV2");
		int a=20;
		int b=10;
		Assert.assertEquals(2, a/b);
	}
	
	@Test
	public void mul()
	{
		System.out.println("MUL2");
		int a=20;
		int b=10;
		Assert.assertEquals(200, a*b);
	}
}
