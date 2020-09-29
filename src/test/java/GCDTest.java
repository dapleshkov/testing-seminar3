import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class GCDTest {

	private static GCD gcd;

	@BeforeAll
	private static void setUp() {
		gcd = new GCD();
	}

	@Test
	void firstAndSecondArgumentsAreDividedByGCD() {
		int gcdResult = gcd.gcd(25, 35);

		assertEquals(25 % gcdResult, 0);
		assertEquals(35 % gcdResult, 0);
	}

	@Test
	void resultIsNotNegative() {
		int gcdResult = gcd.gcd(25, 35);

		assertTrue(gcdResult > 0);
	}


	@Test
	void onPositiveIntegerArguments() {
		assertEquals(gcd.gcd(25, 15), 5);
	}

	@Test
	void onFirstNegativeArgument(){
		assertEquals(gcd.gcd(-25, 15), 5);
	}

	@Test
	void onSecondNegativeArgument(){
		assertEquals(gcd.gcd(25, -15), 5);
	}

	@Test
	void onBothNegativeArguments(){
		assertEquals(gcd.gcd(-25, -15), 5);
	}

	@Test
	void onFirstZeroArgument(){
		assertEquals(gcd.gcd(0, 15), 15);
	}

	@Test
	void onSecondZeroArgument(){
		assertEquals(gcd.gcd(25, 0), 25);
	}

	@Test
	void onBothZeroArguments(){
		assertEquals(gcd.gcd(0, 0), 0);
	}

	@Test
	void onMutuallySimpleArguments(){
		assertEquals(gcd.gcd(7, 9), 1);
	}

	@Test
	void onEqualPositiveArguments(){
		assertEquals(gcd.gcd(15, 15), 15);
	}

	@Test
	void onEqualNegativeArguments(){
		assertEquals(gcd.gcd(-15, -15), 15);
	}

	@Test
	void onFirstArgumentIsGCD(){
		assertEquals(gcd.gcd(5, 15), 5);
	}

	@Test
	void onSecondArgumentIsGCD(){
		assertEquals(gcd.gcd(25, 5), 5);
	}

	@Disabled//too long computations
	@Test
	void onMaxArguments(){
		assertEquals(gcd.gcd(Integer.MAX_VALUE, Integer.MIN_VALUE), 5);
	}
}
