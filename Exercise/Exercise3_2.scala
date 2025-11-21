object exercise3_2 {
  def tail[A](list: scala.List[A]): scala.List[A] = list match {
    case Nil => Nil
    case _ :: t => t
  }

  val arr = List(1, 2, 3)
  println(tail(arr))  // Output: List(2, 3)
}
