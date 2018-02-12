

object numAnimals extends App {

  def howMany(heads:Int, legs:Int):(Any) = {

    if ((legs % 2 == 0)&&(heads< legs/2)) {


      val numChicks = (((4 * heads) - legs) / 2)
      val numCows = ((legs - (2 * heads)) / 2)

      (numChicks, numCows)
    }
    else {
      ("No solution")
    }
  }
  println (howMany(5,8))

}



