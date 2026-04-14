package nn_junit;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UtilsTest{

	@Test
	public void testMyMax() {
		double expected = 7. ;
		double actual = Utils.myMax( 3., 5., 7.  ) ;
		Assertions.assertEquals( expected, actual );

	}

	@Test
	public void testMyMax2() {
		double expected = 5. ;
		double actual = Utils.myMax( -3., 5., -7.  ) ;
		double epsilon = 0. ;
		Assertions.assertEquals( expected, actual, epsilon );
	}
	@Test
	public void testMyMax3() {
		double expected = -3. ;
		double actual = Utils.myMax( -3., -5., -7.  ) ;
		double epsilon = 0. ;
		Assertions.assertEquals( expected, actual, epsilon );
	}
	@Test
	public void testMyMax4() {
		double expected = Double.POSITIVE_INFINITY;
		double actual = Utils.myMax( Double.MAX_VALUE, Double.MIN_VALUE, Double.POSITIVE_INFINITY  ) ;
		double epsilon = 0. ;
		Assertions.assertEquals( expected, actual, epsilon );
	}

}
