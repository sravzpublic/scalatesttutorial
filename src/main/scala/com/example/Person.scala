import play.api.libs.json._

case class Person(name: String, age: Int)

object Person {
  // implicit val format: Format[Person] = Json.format[Person]

  // apply method to create instances of Person
  def apply(name: String, age: Int): Person = new Person(name, age)

  // unapply method to destructure instances of Person
//   def unapply(person: Person): Option[(String, Int)] =
//     person.getClass.getMethods
//       .find(_.getName == "unapply")
//       .map(_.invoke(person).asInstanceOf[Option[(String, Int)]])
//       .getOrElse(None)

  // Define implicit Reads and Writes for Person
//   implicit val personReads: Reads[Person] = Json.reads[Person]
//   implicit val personWrites: Writes[Person] = Json.writes[Person]
//   implicit val personFormat: Format[Person] = Json.format[Person]

}
