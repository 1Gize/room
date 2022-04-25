import scala.collection.mutable.ListBuffer

case class Room(capacity: Int){
  val peopleInside = new ListBuffer[Person]
  def addPerson(p: Person) ={
    if(peopleInside.size < capacity){
      peopleInside += p
    }else{
      println("room is full")
    }
  }
  def removePerson(p: Person): Unit ={
    if(peopleInside.contains(p)){
      peopleInside -= p
    }else{
      println("there is no such person in the room")
    }
  }
}
