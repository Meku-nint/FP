// Class definition
class IntroductionToScala {
  def aboutScala(about: String): String = {
    s"Scala is all about $about"
  }

  def usedFor(usage: String): String = {
    s"Scala is used for $usage"
  }
}

// Singleton object
object MyModule {
  
  // Immutable values
  val aboutScala: String = "functional programming"
  val usage: String = "building scalable applications"

  // Create an instance of IntroductionToScala
  val scalaInfo: IntroductionToScala = new IntroductionToScala()

  // Print class information
  println(scalaInfo.aboutScala(aboutScala))
  println(scalaInfo.usedFor(usage))

  // Method to calculate absolute value
  def abs(n: Int): Int = {
    if (n < 0) -n
    else n
  }

  // Private helper method to format absolute value
  private def formatAbs(x: Int): String = {
    val msg: String = "The absolute value of %d is %d"
    msg.format(x, abs(x))
  }

  // Main method - program entry point
  def main(args: Array[String]): Unit = {
    println(formatAbs(-42))
  }
}
