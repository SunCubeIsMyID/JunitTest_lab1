package Junit;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ParameterMoneyTest {

	boolean expected = false;
	int money = 0;
	
	@Parameters
	public static Collection<Object[]> t(){
		return Arrays.asList(new Object[][] {
			{false,-1},
			{true,0},
			{false,4},
			{true,12},
			{false,19},
			{false,37},
			{false,98}
			
		});
	}
	
	public ParameterMoneyTest(boolean expected, int money) {
		this.expected = expected;
		this.money = money;
	}

	@Test
	public void testMoney() {
		assertEquals(expected,new money().rmoney(money));
	}
}
