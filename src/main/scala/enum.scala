
enum Direction(val dx: Int, val dy: Int):
    case Right  extends Direction(1, 0) // ordinal 0
    case Up     extends Direction(0, 1)
    case Left   extends Direction(-1, 0)
    case Down   extends Direction(0, -1)

    def turnLeft = Direction.values((ordinal + 1) % 4)


@main
def test: Unit =
    val r = Direction.Right
    val x = r.turnLeft
    println(r)
    println(x)
