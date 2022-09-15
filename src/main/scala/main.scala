@main
def main(): Unit = {
  assert(is_interesting(List(1, 2, 3, 4), 3, 3))
  assert(is_interesting(List(1, 0, 1, 1), 2, 1))
  assert(! is_interesting(List(1, 5, 9, 1, 5, 9), 2, 2))

  assert(pattern_matching("abba", "cat dog dog cat"))
  assert(! pattern_matching("abba", "cat dog horse cat"))
}