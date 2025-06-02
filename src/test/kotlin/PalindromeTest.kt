import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import kotlin.test.assertFalse
import kotlin.test.assertTrue

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class PalindromeTest {
    @ParameterizedTest
    @MethodSource("palindromeProvider")
    fun `should return true for palindromes`(palindrome: String) {
        assertTrue { palindrome.isPalindrome() }
    }

    @ParameterizedTest
    @MethodSource("notPalindromeProvider")
    fun `should return false if string is not palindromes`(palindrome: String) {
        assertFalse { palindrome.isPalindrome() }
    }

    private fun palindromeProvider() = listOf(
        Arguments.of("Madam, in Eden, I'm Adam"),
        Arguments.of("Flee to me, remote elf!"),
        Arguments.of("Sex at noon taxes"),
        Arguments.of("A Santa pets rats, as Pat taps a star step at NASA"),
        Arguments.of(""),
        Arguments.of("A"),
        Arguments.of("12321"),
        Arguments.of("123 321"),
        Arguments.of("A man, a plan, a canal: Panama!")
    )

    private fun notPalindromeProvider() = listOf(
        Arguments.of("Madam, Eden, I'm Adam"),
        Arguments.of("Flee to e, remote elf!"),
        Arguments.of("Sex at oon taxes"),
        Arguments.of("A Santa ets rats, as Pat taps a star step at NASA"),
        Arguments.of("Hello"),
        Arguments.of("Kotlin"),
        Arguments.of("Palindrome"),
        Arguments.of("12345"),
        Arguments.of("Was it a car or a cat I saw? No!")
    )
}
