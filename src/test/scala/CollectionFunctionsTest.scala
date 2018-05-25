import org.scalatest.FunSpec
import org.scalatest.Matchers._
import main.scala.CollectionFunctions._

class CollectionFunctionsTest extends FunSpec {

  it("sort") {

    sorting(List()) shouldBe List()
    sorting(List(1)) shouldBe List(1)
    sorting(List(1, 2)) shouldBe List(1, 2)
    sorting(List(2, 1)) shouldBe List(1, 2)
    sorting(List(1, 2, 3)) shouldBe List(1, 2, 3)
    sorting(List(3, 2, 1)) shouldBe List(1, 2, 3)
    sorting(List(5, 3, 1, 2, 4)) shouldBe List(1, 2, 3, 4, 5)
    sorting(List(5, 3, 1, 2, 4, 1)) shouldBe List(1, 1, 2, 3, 4, 5)
  }

  it("append") {

    append(List(1), List()) shouldBe List (1)
    append(List(1), List(2)) shouldBe List (1, 2)
    append(List(1, 2), List(2, 3, 4, 5)) shouldBe List (1, 2, 2, 3, 4, 5)
    append(List(), List(2, 3, 4, 5)) shouldBe List (2, 3, 4, 5)


  }


}
