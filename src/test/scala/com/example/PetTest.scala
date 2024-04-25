import scala.collection.mutable.ArrayBuffer
class PetTest extends org.scalatest.funsuite.AnyFunSuite {
  test("Test split pets") {
    var buffer: ArrayBuffer[Pet] = ArrayBuffer()
    buffer.append(new Dog("Dog", "Dog"))
    buffer.append(new Cat("Cat", "Cat"))
    var bufferDogs = buffer.filter(x => x.pet_type == "Dog")
    var bufferCats = buffer.filter(x => x.pet_type == "Cat")
    assert(bufferDogs.length === bufferCats.length)
  }

}
