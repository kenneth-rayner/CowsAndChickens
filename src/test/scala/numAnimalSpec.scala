import org.scalatest.{MustMatchers, WordSpec}

class numAnimalSpec extends WordSpec with MustMatchers {


  "howMany is called" must {

    "return 'No solution found" in {
      numAnimals.howMany(2, 5) mustEqual "No solution found"
    }
    "return 'No solution found1" in {
      numAnimals.howMany(2, 10) mustEqual "No solution found"
    }
    "return result 1,2" in {
      numAnimals.howMany(3, 10) mustEqual (1,2)

    }
    "return result 2,2" in {
      numAnimals.howMany(4, 12) mustEqual (2,2)

  }
    "return result 4,2" in {
      numAnimals.howMany(6, 16) mustEqual (4,2)

    }

}
}