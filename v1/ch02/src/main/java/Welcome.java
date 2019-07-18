import java.math.BigDecimal;

/**
 * This program displays a greeting for the reader.
 * 
 * @version 1.30 2014-02-27
 * @author Cay Horstmann
 */
public class Welcome {
	public static void main(String[] args) {
		String greeting = "Welcome to Core Java!";
		System.out.println(greeting);
		for (int i = 0; i < greeting.length(); i++)
			System.out.print("=");
		System.out.println();
		
		BigDecimal bigDecimal=BigDecimal.valueOf(333.333333);
		bigDecimal=bigDecimal.setScale(2, BigDecimal.ROUND_HALF_EVEN);
		System.out.println(bigDecimal);
	}
}
