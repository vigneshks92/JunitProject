package junits;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class AssumtionsExample {
	
	
	@BeforeAll
	public static void SetUp(){
		
		System.setProperty("ENV", "DEV");	
	}
	
	@Test
	public void test1() {
		
		assumeTrue("DEV".equals(System.getProperty("ENV")));
		
		assertTrue(StringFunctions.isPalindrome("madam"));
		assertTrue(StringFunctions.isPalindrome("racecar"));
		
	}

}
