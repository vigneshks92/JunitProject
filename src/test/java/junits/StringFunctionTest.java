package junits;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;

public class StringFunctionTest {
	
	@Tag("Sanity")
	@DisplayName("PositiveTest")
	@Test
	public void test1() {
		
		assertTrue(StringFunctions.isPalindrome("madam"));
		assertTrue(StringFunctions.isPalindrome("racecar"));
		
	}
	
	@Test
	public void test2() {
		
		assertFalse(StringFunctions.isPalindrome("vignesh"));
		
	}

}
