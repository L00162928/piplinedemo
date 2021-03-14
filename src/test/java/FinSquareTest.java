import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 
 */

/**
 * @author Administrator
 *
 */
public class FinSquareTest {

	/**
	 * @throws java.lang.Exception
	 */
	
	@Test
	public void testSquare() {
		FindSquare objsq=new FindSquare();
		int sq=objsq.square(5);
		assertEquals(25,sq);
	}

	

}
