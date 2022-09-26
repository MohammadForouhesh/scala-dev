import scala.runtime.Nothing$

def balance(chars: List[Char]): Boolean =
    def scoring(char: Char): Int = char match
        case ')' => -1
        case '(' => 1
        case _ => 0

    chars.filter(scoring(_) != 0) match
        case Nil => true
        case List(x) => scoring(x) == 0
        case '(' :: xs => if xs.contains(')') then !(xs.indexOf(')') == 0 ^ balance(xs)) else false
        case ')' :: xs => balance(xs)


@main
def balancer: Unit =
    println(balance("(if (zero? x) max (/ 1 x))".toList))
    println(balance("(if (zero? x max (/ 1 x))".toList))
    println(balance("I told him (that it's not (yet) done).\n(But he wasn't listening)".toList))
    println(balance(":-)".toList))
    println(balance("())(".toList))
    println(balance("()(".toList))
    println(balance("()()((()(".toList))
    println(balance("(()()())".toList))

