import java.lang.IllegalArgumentException

object Hamming {


    fun compute(leftStrand: String, rightStrand: String): Int {
        
        if (leftStrand.length != rightStrand.length) {
            throw IllegalArgumentException("left and right strands must be of equal length", Throwable())
        }

        return leftStrand.indices.count { leftStrand[it]  != rightStrand[it]}
    }
}
