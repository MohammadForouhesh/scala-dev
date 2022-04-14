
def isInteresting(numbers: List[Int], t: Int, k: Int): Unit = {
    for {ind <- 1 to k} do {
        val difference = for index <- 0 until (numbers.length - ind - 1) yield math.abs(numbers(index) - numbers(index + ind))
        difference.exists(item => item < t)
    }
}