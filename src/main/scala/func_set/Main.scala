package func_set

object Main extends App:
    import FunSets.*
    println(contains(singletonSet(1), 1))
    println(exists((x: Int) => x % 25 == 0, (x: Int) => x == 0))
    println(FunSets.toString(map((x: Int) => x < 10 && -10 < x, (x: Int) => x * 3)))
