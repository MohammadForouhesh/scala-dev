
def pascal(c: Int, r: Int): Int =
    if r == 0 || c == 0 || c == r then 1 else pascal(c, r - 1) + pascal(c - 1, r - 1)


@main
def triangle: Unit =
    println("Pascal's Triangle")
    for row <- 0 to 10 do
        print(" "*(10 - row))
        for col <- 0 to row do
            print(s"${pascal(col, row)} ")
        println()
