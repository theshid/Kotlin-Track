import java.time.LocalDate
import java.time.LocalDateTime


class Gigasecond(moment: LocalDateTime) {


    constructor(moment: LocalDate) : this(moment = moment.atStartOfDay()) {

    }
    val gigaSecond = 1000000000L
    val date: LocalDateTime = moment.plusSeconds(gigaSecond)


}
