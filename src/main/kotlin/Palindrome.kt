fun String.isPalindrome(): Boolean {
    val sanitized = lowercase().filter { it.isLetterOrDigit() }
    return sanitized == sanitized.reversed()
}
