package partB;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.jupiter.api.Test;
/**
 * check the correctness of Quadratic_cal function using the tests we were given
 * @author user
 *
 */
class QuadraticTest {

	@Test
	void testQuadratic_cal() {
		double a = -2.3;
		double b = 5.1;
		double c = 12.62;
		Quadratic temp = new Quadratic();
		temp.Quadratic_cal(a, b, c);
		assertEquals(-1.4828603612837297, temp.x1);
		assertEquals(3.7002516656315563, temp.x2);
		
		a = 1;
		b = -5;
		c = 6;
		temp.Quadratic_cal(a, b, c);
		assertEquals(3.0, temp.x1);
		assertEquals(2.0, temp.x2);
		
		a = 1;
		b = -2;
		c = 1;
		temp.Quadratic_cal(a, b, c);
		assertEquals(1.0, temp.x1);
		assertEquals(1.0, temp.x2);
		
		a = 0;
		b = 2;
		c = 5;
		temp.Quadratic_cal(a, b, c);
		assertEquals(-2.5, temp.x1);
		assertEquals(-2.5, temp.x2);
		
		a = 1;
		b = 0;
		c = 0;
		temp.Quadratic_cal(a, b, c);
		assertEquals(0.0, temp.x1);
		assertEquals(0.0, temp.x2);
		
		
		//assertFalse(temp.Quadratic_cal(0, 0, 0));
		//assertEquals(false, temp.Quadratic_cal(0, 0, 0));

	}
}
