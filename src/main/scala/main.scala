@main
def main(): Unit = {
  assert(isInteresting(List(1, 2, 3, 4), 3, 3))
  assert(isInteresting(List(1, 0, 1, 1), 2, 1))
  assert(! isInteresting(List(1, 5, 9, 1, 5, 9), 2, 2))

  assert(pattern_matching("abba", "cat dog dog cat"))
  assert(! pattern_matching("abba", "cat dog horse cat"))
}