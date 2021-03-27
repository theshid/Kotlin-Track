class Anagram constructor(val input: String) {
    // TODO: implement proper constructor to complete the task

    fun match(anagrams: Collection<String>): Set<String> {
        var result = mutableListOf<String>()
        var word = input.toLowerCase()
        for (items in anagrams) {
            if (word.length != items.length || word == items.toLowerCase()) {
                continue
            }
           if (word.filter(Char::isLetter).groupBy { it } == items.toLowerCase().filter(Char::isLetter).groupBy { it }) {
               result.add(items)
           }
        }
        return result.toSet()
    }
}
