object Pangram {

    fun isPangram(input: String): Boolean {
        val newInput = input.toLowerCase()
        return ('a'..'z').all { it in newInput }
    }
}

//Best Solution
/*object Pangram {
    fun isPangram(str: String) = ('a'..'z').all { str.contains(it, ignoreCase = true) }
}*/
