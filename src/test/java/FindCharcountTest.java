import static org.junit.Assert.*;


import org.junit.Test;

/**
 * 
 */

/**
 * @author Administrator
 *
 */
public class FindCharcountTest {

	/**
	 * @throws java.lang.Exception
	 */
	
	/**
	 * Test method for {@link FindSquare#countA(java.lang.String)}.
	 */
	@Test
	public void testCountA() {
		FindSquare objsq1=new FindSquare();
		int out=objsq1.countA("Anika");
		assertEquals(2,out);
	}

}
