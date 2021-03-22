object Isogram {

    fun isIsogram(input: String): Boolean {
        var shizu = HashMap<Char, Boolean>()
        var inputToLower = input.toLowerCase()
        for (item in inputToLower) {
            if (item < 'a' || item > 'z') {
                continue
            }
            if (shizu[item] == true) {
                return false
            }
            shizu[item] = true
        }
        return true
    }

   /* fun isIsogram(phrase: String) = phrase.toLowerCase()
            .filter(Char::isLetter)
            .let { it.toSet().size == it.length }*/
}
