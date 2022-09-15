def is_interesting(numbers: List[Int], t: Int, k: Int): Boolean = {
    for {ind <- 1 to k} do {
        val difference = for index <- 0 until (numbers.length - ind - 1) yield math.abs(numbers(index) - numbers(index + ind))
        if difference.exists(item => item < t) then
            return true
    }
    false
}


def pattern_matching(rule: String, stream: String): Boolean = {
    val split_rule: Array[String]     = rule.split("")
    val split_stream: Array[String]   = stream.split(" ")
    var pattern: Map[String, String]  = Map(split_rule(0) -> split_stream(0))
    for ind <- split_rule.indices do {
        if pattern.contains(split_rule(ind)) then
            if pattern(split_rule(ind)) != split_stream(ind) then
                return false

        else pattern += (split_rule(ind) -> split_stream(ind))
    }
    true
}
