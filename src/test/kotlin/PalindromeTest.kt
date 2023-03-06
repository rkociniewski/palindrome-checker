import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertAll
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class PalindromeTest {
    @Test
    fun `should return true for palindromes`() = assertAll(
        { assertTrue("Madam, in Eden, I'm Adam".isPalindrome()) },
        { assertTrue("Flee to me, remote elf!".isPalindrome()) },
        { assertTrue("Sex at noon taxes".isPalindrome()) },
        { assertTrue("A Santa pets rats, as Pat taps a star step at NASA".isPalindrome()) }
    )

    @Test
    fun `should return false if string is not palindromes`() = assertAll(
        { assertFalse("xxxs".isPalindrome()) },
        { assertFalse("this is not palindrome".isPalindrome()) },
    )
}