object Bob {
    fun hey(prompt: String): String {
        var newPrompt = prompt.trim()
        return when {
            newPrompt.isYelling() && newPrompt.isQuestion() -> "Calm down, I know what I'm doing!"
            newPrompt.isYelling() -> "Whoa, chill out!"
            newPrompt.isQuestion() -> "Sure."
            newPrompt.isSilence() -> "Fine. Be that way!"

            else -> "Whatever."
        }
    }

    private fun String.isQuestion(): Boolean = endsWith("?")
    private fun String.isSilence(): Boolean = isBlank()
    private fun String.isYelling(): Boolean {
        return !letters().isSilence() and letters().isUpperCase()
    }

    private fun String.isUpperCase(): Boolean = all(Char::isUpperCase)
    private fun String.letters(): String = filter(Char::isLetter)
}