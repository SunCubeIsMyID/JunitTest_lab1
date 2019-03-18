package Junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class moneyTest {

	@Test
	public void rmoney() {
		assertEquals(true,new money().rmoney(12));
	}

}
