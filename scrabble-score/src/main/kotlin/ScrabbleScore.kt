object ScrabbleScore {

    fun scoreLetter(c: Char): Int {
        return when (c) {
            'a', 'e', 'i', 'o', 'u', 'n', 'l', 'r', 's', 't' -> 1
            'd', 'g' -> 2
            'b', 'c', 'm', 'p' -> 3
            'f', 'h', 'v', 'w', 'y' -> 4
            'k' -> 5
            'j', 'x' -> 8
            'z', 'q' -> 10
            else -> { // Note the block
                0
            }
        }

    }

    fun scoreWord(word: String): Int {
        val result = word.toLowerCase().map { scoreLetter(it) }.sum()
        return result
    }
}
