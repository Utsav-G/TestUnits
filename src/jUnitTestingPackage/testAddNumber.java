package jUnitTestingPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddNumber {

	@Test
	public void test() {
		jUnitFunction junitnumber = new jUnitFunction();
		int result = junitnumber.addNumbers(123, 27);
		assertEquals (150,result);
	}

}
