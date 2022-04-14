
def isInteresting(numbers: List[Int], t: Int, k: Int): Unit = {
    for {ind <- 1 to k-1} do {
        val difference = for index <- 1 to (numbers.length - ind) yield numbers(index) - numbers(index + ind)
        println(difference)
    }
}