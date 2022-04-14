
def isInteresting(numbers: List[Int], t: Int, k: Int): Boolean = {
    for {ind <- 1 to k} do {
        val difference = for index <- 0 until (numbers.length - ind - 1) yield math.abs(numbers(index) - numbers(index + ind))
        if difference.exists(item => item < t) then
            return true

    }
    return false
}