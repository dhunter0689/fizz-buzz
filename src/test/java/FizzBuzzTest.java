import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FizzBuzzTest {

	FizzBuzz underTest = new FizzBuzz();

	@Test
	public void shouldBe1For1() {

		String result = underTest.getResponse(1);

		assertEquals("1", result);

	}

	@Test
	public void shouldBe2For2() {

		String result = underTest.getResponse(2);

		assertEquals("2", result);

	}

	@Test
	public void shouldBeFizzFor3() {

		String result = underTest.getResponse(3);
		assertEquals("Fizz", result);
	}

	@Test
	public void shouldBeBuzzFor5() {

		String result = underTest.getResponse(5);
		assertEquals("Buzz", result);
	}

	@Test
	public void shouldBeFizzFor6() {

		String result = underTest.getResponse(6);
		assertEquals("Fizz", result);
	}

	@Test
	public void shouldBeBuzzFor10() {

		String result = underTest.getResponse(10);
		assertEquals("Buzz", result);
	}
	
	@Test
	public void shouldBeFizzBuzzFor15 () {
		String result = underTest.getResponse(15);
		assertEquals("FizzBuzz", result);
	}
}
