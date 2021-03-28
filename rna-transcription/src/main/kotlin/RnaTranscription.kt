fun transcribeToRna(dna: String): String {
    var rna = ""
    for (letter in dna) {

        when (letter) {
            'G' -> rna+='C'
            'C' -> rna+='G'
            'T' -> rna+='A'
            'A' -> rna+='U'
            else -> { // Note the block

            }
        }
    }
    return rna
}

/*fun transcribeToRna(dna: String): String = dna.map{
    when(it) {
        'G' -> 'C'
        'C' -> 'G'
        'T' -> 'A'
        'A' -> 'U'
        else ->it
    }
}.joinToString(separator="")*/
