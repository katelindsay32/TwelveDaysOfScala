object Program {
  def main(args: Array[String]): Unit = {

    println("What day of Christmas is it?")
    val input = scala.io.StdIn.readLine()

    //println("Total gift count: " + computeGiftTotalLoop(s.toInt, 0));
    println("Total gift count: " + computeGiftTotal(input.toInt, 0));
  }

  val daysMap = Map(
    1 -> "Partridge in a pear tree",
    2 -> "Turtle Doves",
    3 -> "French Hens",
    4 -> "Calling Birds",
    5 -> "Golden Rings",
    6 -> "Geese-a-layin'",
    7 -> "Swans-a-swimming",
    8 -> "Maids-a-milkin",
    9 -> "Ladies Dancing",
    10 -> "Lords-a-leapin'",
    11 -> "Pipers Piping",
    12 -> "Drummers drumming");

  def computeGiftTotal(dayOfChristmas: Int, currentGiftSum: Int): Int = {
    var day: Int = dayOfChristmas;
    var sum: Int = currentGiftSum;

    if (day == 0) {
      return sum;
    }

    daysMap.keys.filter { x => x.<=(day) }.foreach { x => sum += x }

    return computeGiftTotal((day - 1), sum);
  }

  def computeGiftTotalLoop(dayOfChristmas: Int, currentGiftSum: Int): Int = {

    var day: Int = dayOfChristmas;
    var sum: Int = currentGiftSum;

    if (day == 0) {
      return sum;
    }

    for (day <- 1 to day) {
      println("Value of a: " + day);
      sum += day;
    }

    return computeGiftTotalLoop((day - 1), sum);
  }
}