sealed trait List[+A]
case object Nil extends List[Nothing]
case class Cons[+A](head: A, tail: List[A]) extends List[A]

object exercise3_3 {
  
  def setHead[A](list: List[A], h: A): List[A] = list match {
    case Nil => Cons(h, Nil)       // or throw an error if list is empty
    case Cons(_, t) => Cons(h, t)  // replace head, keep tail
  }

  // Example usage:
  val myList = Cons(1, Cons(2, Cons(3, Nil)))

  val newList = setHead(myList, 10)
  println(newList) // Output: Cons(10, Cons(2, Cons(3, Nil)))
}
