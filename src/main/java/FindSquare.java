/**
 * 
 */

/**
 * @author Administrator
 *
 */
public class FindSquare {
	public int square(int x)
	{
		return x*x;
	}
	
	public int countA(String str) {
		int count=0;
		for (int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a'||str.charAt(i)=='A') {
				count++;
			}
		}
		return count;
				
	}
	
}
