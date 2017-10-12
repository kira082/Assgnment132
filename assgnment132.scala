def fib_iter(n: Int) = {
  if (n < 2) n
  else {
    var ans = 0
    var n1 = 0
    var n2 = 1

    var i = n - 1
    while (i > 0) {
      i = i - 1
      ans = n1 + n2
      n1 = n2
      n2 = ans
    }
  ans
  }
}


def fibonaccis(max: Int): List[Int] = { fibonaccis(max, 2, 1) }
private def fibonaccis(max: Int, prev: Int, prevPrev: Int): List[Int] = prev >= max match {
  case true => List[Int](prevPrev)
  case false => prevPrev :: fibonaccis(max, prev + prevPrev, prev)
}
