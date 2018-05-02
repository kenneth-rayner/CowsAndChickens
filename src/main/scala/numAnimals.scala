import scala.io.StdIn
import scala.language.postfixOps

object numAnimals extends App {

  def howMany(heads: Int, legs: Int): (Any) = {

    if (legs % 2 == 0) {
      val numChicks = ((4 * heads) - legs) / 2
      val numCows = (legs - (2 * heads)) / 2

      if ((numChicks >= 0) && (numCows >= 0)) {
        println(s"Number of chickens:$numChicks\nNumber of cow:$numCows" )
        (numChicks,numCows)

      }
      else
        "No solution found"

    }
    else "No solution found"
  }

  val numHeads = StdIn.readLine("Enter number of heads:").toInt
  val numLegs = StdIn.readLine("Enter number of legs:").toInt
  println(howMany(numHeads, numLegs))
}
