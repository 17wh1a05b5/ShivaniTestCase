package epamcom.Removechars;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

public class Remove {
	/*TODO List 
	 * 1. "" => ""
	 * 2. "A" => ""
	 * 3. "B" => "B"
	 * 4. "AA" => ""
	 * 5. "AB" => "B"
	 * 6. "BA" => "B"
	 * 7. "AACD" => "CD"
	 * 8. "ABCD" => "BCD"
	 * 9. "BACD" => "BCD";
	 * 10. "BBAA" => "BBAA"
	 * 11. "BCDE" => "BCDE"
	 * 12. "AABAA" => "AABAA"
	 * 13. "BCDAB" => "BCDAB"
	 * 14. "AAAAAAA" => "AAAAA"
	 */
	
	RemoveChars remove;;
	@BeforeEach
	public void setUp() {
		remove = new RemoveChars();
	}
	@Test
	public void test0Char() {
		remove = new RemoveChars();
	}
	@Test
	public void test1RemoveA() {
		assertEquals("", remove.Remove("A"));
	}
	
	@Test
	public void test1CharAAtFirst() {
		assertEquals("B", remove.Remove("B"));
	}
	@Test
	public void test2Remove2AChars() {
		assertEquals("", remove.Remove("AA"));
	}
	@Test
	public void test2CharsAFirst() {
		assertEquals("B", remove.Remove("AB"));
	}
	@Test
	public void test2CharsASecond() {
		assertEquals("B", remove.Remove("BA"));
	}
	@Test
	public void test4Chars2A() {
		assertEquals("CD", remove.Remove("AACD"));
	}
	
	@Test
	public void test4Chars1A() {
		assertEquals("BCD", remove.Remove("ABCD"));
	}
	
	@Test
	public void test4CharsASecond() {
		assertEquals("BCD", remove.Remove("BACD"));
	}
	
	@Test
	public void test4CharsNoAFirst() {
		assertEquals("BBAA", remove.Remove("BBAA"));
	}
	
	@Test
	public void test4CharsNoA() {
		assertEquals("BCDE", remove.Remove("BCDE"));
	}
	
	@Test
	public void testNChars() {
		assertEquals("BAA", remove.Remove("AABAA"));
	}
	
	@Test
	public void testNCharsAatPosition() {
		assertEquals("BCDAB", remove.Remove("BCDAB"));
	}
	
	@Test
	public void testNCharsOfAllACharacters() {
		assertEquals("AAAAA", remove.Remove("AAAAAAA"));
	}
}