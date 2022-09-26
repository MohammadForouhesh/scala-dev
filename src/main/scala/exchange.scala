
import math.floor


def countChange(money: Int, coins: List[Int]): Int =

    def elemSum(xs: List[Int], ys: List[Int]): List[Int] = xs.zip(ys).map(_ + _)

    def gcd(x: Int, y: Int): Int = if x % y == 0 then y else gcd(y, x % y)

    def gcdList(xs: List[Int]): Int = xs.reduceLeft(gcd)

    def initial_solution(money: Int, x: Int, y: Int): List[Int] =
        if money % x == 0 then List(money/x, 0) else elemSum(initial_solution(money - y, x, y), List(0, 1))

    def diophantine(money: Int, x: Int, y: Int): Int =
        if money % gcd(x, y) != 0 then 0 else gcd(x, y)*initial_solution(money, x, y).head/y + 1

    (money, coins) match
        case (0, _) => 0
        case (_, Nil) => 0
        case (x, List(y)) => if x % y == 0 then 1 else 0
        case (x, y :: ys) => diophantine(x, y, gcdList(ys)) + countChange(x, ys)


@main
def exchanger: Unit =
    println(countChange(100, List(7, 3, 8, 21)))
    println(countChange(300, List(500, 5, 50, 100, 20, 200, 10)))// == 1022)