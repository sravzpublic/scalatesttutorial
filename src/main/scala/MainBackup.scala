import scala.io.Source
import play.api.libs.json._
import java.io.PrintWriter
import play.api.libs.json.Json
import scala.collection.mutable.ArrayBuffer
import sttp.client3._
import sttp.client3.asynchttpclient.future.AsyncHttpClientFutureBackend
import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.{Failure, Success}
import scala.collection.mutable.HashMap

object MainBackup {
  def run() {
    // println("Hello, World!")
    // Calls and Object usage
//   val greeter = new Greeter("Hello", "World")
//   greeter.greet("Life" + "" + CubeCalculator.cube(5))

    // Case classes
//   val point = Point(1, 2)
//   val point1 = Point(1, 2)
//   if (point == point1) {
//     println("Both points are equal")
//   }

//   // Object usage - singleton
//   val newId: Int = IdFactory.create()
//   println(newId) // 1
//   val newerId: Int = IdFactory.create()
//   println(newerId) // 2

//   // Create instances of class which extend trait
//   val greeter = new DefaultGreeter()
//   greeter.greet("Scala developer") // Hello, Scala developer!

//   val customGreeter = new CustomizableGreeter("How are you, ", "?")
//   customGreeter.greet("Scala developer") // How are you, Scala developer?

//   val point = new Point(1, 2)
//   point.x = 1
//   point.y = 2
//   point.x = 2
//   println(point)

    // utils.log(message = "hello world", level = "WARNING")

    // Trait usage
//   val dog = new Dog("Harry")
//   val cat = new Cat("Sally")
//   val animals = ArrayBuffer.empty[Pet]
//   animals.append(dog)
//   animals.append(cat)
//   animals.foreach(pet => println(pet.name))

    // Traits as minix
//   val d = new D
//   println(d.message) // I'm an instance of class B
//   println(d.loudMessage) // I'M AN INSTANCE OF CLASS B

//   val richStringIter = new RichStringIter
//   richStringIter.foreach(println)

    // Higher Order Functions
//   val domainName = "www.example.com"
//   def getURL = urlBuilder(ssl = true, domainName)
//   val endpoint = "users"
//   val query = "id=1"
//   println(getURL(endpoint, query))

    // println(factorial(5))

    // Case class usage
//   val message4 = Message(
//     "julien@bretagne.fr",
//     "travis@washington.us",
//     "Me zo o komz gant ma amezeg"
//   )
//   val message5 =
//     message4.copy(
//       sender = message4.recipient,
//       recipient = "claire@bourgogne.fr"
//     )
//   println(message5.sender) // travis@washington.us
//   println(message5.recipient) // claire@bourgogne.fr
//   println(message5.body) // "Me zo o komz gant ma amezeg"

//     // // Sealed Trait
//     val someSms = SMS("12345", "Are you there 123?")
//     val someVoiceRecording = VoiceRecording("Tom", "voicerecording.org/id/123")

//     println(
//       utils.showNotification(someSms)
//     ) // prints You got an SMS from 12345! Message: Are you there?

//     println(
//       utils.showNotification(someVoiceRecording)
//     ) // prints You received a Voice Recording from Tom! Click the link to hear it: voicerecording.org/id/123
//   }

//     // Read write from JSON
//     val jsonString = Source
//       .fromFile(
//         "/Users/fd98279/workspace/repos/scala_poc/scalatesttutorial/src/test/scala/data/people.json"
//       )
//       .getLines
//       .mkString

//     val outputFile =
//       "/Users/fd98279/workspace/repos/scala_poc/scalatesttutorial/src/test/scala/data/people_output.json"
//     val writer = new PrintWriter(outputFile)

//     // Parse JSON string into a JsValue
//     val json: JsValue = Json.parse(jsonString)

//     // Convert JsValue to a sequence of Person objects
//     val persons: Seq[Person] = json.as[Seq[Person]]

//     // Print the parsed data
//     persons.foreach(println)
//     val orderedPersons = persons.sortBy(_.age)
//     val personWithMaxAge = orderedPersons.last
//     println("Ordered Persons:")
//     orderedPersons.foreach(println)
//     println("\nPerson with Max Age:")
//     println(personWithMaxAge)

//     val jsonArray: JsArray = Json.toJson(persons).asInstanceOf[JsArray]

//     try {
//       writer.println(Json.prettyPrint(jsonArray))
//     } finally {
//       writer.close()
//     }

    // print("Enter your name: ")

    // // Read a line of input from the console
    // val name = scala.io.StdIn.readLine()

    // // Print the input value
    // println(s"Hello, $name!")

    // Collection future
    // def fetchUrl(url: String): Future[String] = {
    //   implicit val backend = AsyncHttpClientFutureBackend()
    //   val request = basicRequest.get(uri"$url")
    //   request.send().map(_.body.getOrElse("Error"))
    // }

    // // List of URLs to fetch data from
    // val urls = LazyList(
    //   "https://jsonplaceholder.typicode.com/posts/1",
    //   "https://jsonplaceholder.typicode.com/posts/2",
    //   "https://jsonplaceholder.typicode.com/posts/3"
    // )

    // // Process each URL asynchronously
    // val futureResponses = urls.map(fetchUrl)

    // // Future to handle all responses once they are ready
    // val aggregatedResponses = Future.sequence(futureResponses)

    // aggregatedResponses.onComplete {
    //   case Success(responses) =>
    //     responses.foreach(println)
    //     AsyncHttpClientFutureBackend()
    //       .close() // Don't forget to close the backend
    //   case Failure(exception) =>
    //     println(s"Failed with exception: $exception")
    //     AsyncHttpClientFutureBackend().close()
    // }

    // List partition
    // val numbers = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    // // Partition the numbers into even and odd
    // val (evenNumbers, oddNumbers) = numbers.partition(_ % 2 == 0)

    // println("Even numbers: " + evenNumbers)
    // println("Odd numbers: " + oddNumbers)

    // Match pattern
//   val petList = List(
//     new Dog("Dog", "Dog"),
//     new Cat("Cat", "Cat")
//   )

//   for (pet <- petList) {
//     pet match {
//       case Dog(name, pet_type) => println(s"Name: $name, PetType: $pet_type")
//       case Cat(name, pet_type) => println(s"Name: $name, PetType: $pet_type")
//     }
//   }

  }
}
