package guru.springframework;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

public class MoneyTest {

	@Test
	void testMultiplicationDollar() {
		Money d = Money.dollar(5);
		Money d2 = d.times(2);
		assertEquals(10, d2.amount);
		d2 = d.times(3);
		assertEquals(15, d2.amount);
	}

	@Test
	void testEqualityDOllar() {
		assertEquals(Money.dollar(5), Money.dollar(5));
	}

	@Test
	void testMultiplicationFranc() {
		Money d = Money.franc(5);
		Money d2 = d.times(2);
		assertEquals(10, d2.amount);
		d2 = d.times(3);
		assertEquals(15, d2.amount);
	}

	@Test
	void testEqualityFranc() {
		assertEquals(Money.franc(5), Money.franc(5));
		assertNotEquals(Money.franc(5), Money.dollar(5));
	}

	@Test
	void testCurrency() {
		assertEquals("USD", Money.dollar(1).currency);
		assertEquals("CHF", Money.franc(1).currency);
	}
}
