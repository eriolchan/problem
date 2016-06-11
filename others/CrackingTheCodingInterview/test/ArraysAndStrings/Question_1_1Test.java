package ArraysAndStrings;

import static org.junit.Assert.*;

import org.junit.Test;

public class Question_1_1Test {

	@Test
	public void testIsUniqueChars_UniqueChars() {
		String s = "abc";

		boolean actual = Question_1_1.isUniqueChars_ASCII(s);
		assertTrue(actual);
		
		actual = Question_1_1.isUniqueChars_Bits(s);
		assertTrue(actual);

		actual = Question_1_1.isUniqueChars_Self(s);
		assertTrue(actual);
	}

	@Test
	public void testIsUniqueChars_DepuplicatedChars() {
		String s = "aba";

		boolean actual = Question_1_1.isUniqueChars_ASCII(s);
		assertFalse(actual);

		actual = Question_1_1.isUniqueChars_Bits(s);
		assertFalse(actual);

		actual = Question_1_1.isUniqueChars_Self(s);
		assertFalse(actual);
	}

	@Test
	public void testIsUniqueChars_OneChar() {
		String s = "a";

		boolean actual = Question_1_1.isUniqueChars_ASCII(s);
		assertTrue(actual);

		actual = Question_1_1.isUniqueChars_Bits(s);
		assertTrue(actual);

		actual = Question_1_1.isUniqueChars_Self(s);
		assertTrue(actual);
	}

	@Test
	public void testIsUniqueChars_SameChar() {
		String s = "aaa";

		boolean actual = Question_1_1.isUniqueChars_ASCII(s);
		assertFalse(actual);

		actual = Question_1_1.isUniqueChars_Bits(s);
		assertFalse(actual);

		actual = Question_1_1.isUniqueChars_Self(s);
		assertFalse(actual);
	}

	@Test
	public void testIsUniqueChars_EmptyString() {
		String s = "";

		boolean actual = Question_1_1.isUniqueChars_ASCII(s);
		assertFalse(actual);

		actual = Question_1_1.isUniqueChars_Bits(s);
		assertFalse(actual);

		actual = Question_1_1.isUniqueChars_Self(s);
		assertFalse(actual);
	}

	@Test
	public void testIsUniqueChars_Null() {
		String s = null;

		boolean actual = Question_1_1.isUniqueChars_ASCII(s);
		assertFalse(actual);

		actual = Question_1_1.isUniqueChars_Bits(s);
		assertFalse(actual);

		actual = Question_1_1.isUniqueChars_Self(s);
		assertFalse(actual);
	}
}