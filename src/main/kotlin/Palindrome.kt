fun String.isPalindrome() = replace("[\\W+]".toRegex(), "").let { it.equals(it.reversed(), true) }
