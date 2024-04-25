import scala.collection.mutable.ArrayBuffer

trait Pet { self =>
  val name: String
  val pet_type: String
  def split_pets(buffer: ArrayBuffer[Pet]): ArrayBuffer[ArrayBuffer[Pet]] = {
    var bufferDogs = buffer.filter(x => x.pet_type == "Dog")
    var bufferCats = buffer.filter(x => x.pet_type == "Cat")
    var returnValue: ArrayBuffer[ArrayBuffer[Pet]] =
      ArrayBuffer[ArrayBuffer[Pet]]()
    returnValue.append(bufferDogs)
    returnValue.append(bufferCats)
  }

}

class Cat(val name: String, val pet_type: "Cat") extends Pet {}

object Cat {
  // Apply method to create instances of PersonLike
  def apply(name: String, pet_type: String): Cat = new Cat(name, "Cat")

  // Unapply method to destructure instances of PersonLike
  def unapply(cat: Cat): Option[(String, "Cat")] = Some(
    (cat.name, cat.pet_type)
  )
}

class Dog(val name: String, val pet_type: "Dog") extends Pet {}

object Dog {
  // Apply method to create instances of PersonLike
  def apply(name: String, pet_type: String): Dog = new Dog(name, "Dog")

  // Unapply method to destructure instances of PersonLike
  def unapply(dog: Dog): Option[(String, "Dog")] = Some(
    (dog.name, dog.pet_type)
  )
}
