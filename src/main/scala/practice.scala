object NumberCheck {
  def isOddAndNotDivisibleBy3(num: Int): Boolean = {
    num % 2 != 0 && num % 3 != 0
  }

  def main(args: Array[String]): Unit = {
    val number = 7 // Example number
    if (isOddAndNotDivisibleBy3(number)) {
      println(s"$number is odd and not divisible by 3")
    } else {
      println(s"$number is either even or divisible by 3")
    }

    // Run the main method to see the output
    NumberCheck.main(Array())
  }
}
