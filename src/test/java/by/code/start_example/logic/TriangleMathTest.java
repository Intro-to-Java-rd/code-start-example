package by.code.start_example.logic;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


@RunWith(value = Parameterized.class)
public class TriangleMathTest {
	
	private int x;
	private int y;
	private int z;
	private boolean expected;
	
	private static TriangleMath triangleMath; 
	
	public TriangleMathTest(int x, int y, int z, boolean expected) {
		this.x = x;
		this.y = y;
		this.z = z;
		this.expected = expected;
	}
	
	@Parameters
	public static Collection<Object[]> powTableValues(){
		return Arrays.asList(new Object[][]{
			   	{ 100, 100, 100, true }, 
			   	{ 200, 100, 100, false }, 
			   	{ 300, 400, 500, false },
			});
	}
	
	@BeforeClass
	public static void createTriangleMath() {
		triangleMath = new TriangleMath();
	}


	@Test
	public void testIsEquilateral() {
		boolean real;
		
		real = triangleMath.isEquilateral(x, y, z);
		
		Assert.assertEquals(real, expected);
	}
}
