class DiamondPrinter {
    fun printToList(c: Char) = listOf('A' until c, c downTo 'A')
            .flatten()
            .map { printRow(c, it) }


    private fun printRow(letter: Char, i: Char) = listOf(letter downTo 'A', 'B'..letter)
            .flatten()
            .map { if (it == i) i else ' ' }
            .joinToString("")


}

