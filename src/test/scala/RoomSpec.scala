import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class RoomSpec extends AnyFlatSpec with should.Matchers{
  val room = Room(1)
  val krzysiek = Person("Krzysiek")
  val ania = Person("Ania")
  "function addPerson" should "add a person to a room if there is capicity" in{
    room.addPerson(krzysiek)
    room.peopleInside.length shouldBe 1
    room.addPerson(ania)
    room.peopleInside.length shouldBe 1
  }
  "function removePerson" should "remove person from a room if a person is there" in{
    room.addPerson(krzysiek)
    room.removePerson(krzysiek)
    room.peopleInside.size shouldBe 0
    room.addPerson(ania)
    room.removePerson(krzysiek)
    room.peopleInside.size shouldBe 1
  }
}
