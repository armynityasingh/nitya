import scala.io.StdIn._

object RangeCheck {
  def isInRange(num: Int): Boolean = {
    (num >= 1 && num <= 10) || (num >= 20 && num <= 30)
  }

  def main(args: Array[String]): Unit = {
    println("Enter a number:")
    val number = readInt() // Taking user input

    if (isInRange(number)) {
      println(s"$number is within the range [1, 10] or [20, 30]")
    } else {
      println(s"$number is not within the range [1, 10] or [20, 30]")
    }
  }
}
