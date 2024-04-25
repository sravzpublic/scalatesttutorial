// Define a trait for the LinkedList
sealed trait LinkedList[+T]

// Define case objects for the LinkedList
case object EmptyList extends LinkedList[Nothing]
case class ListNode[T](value: T, next: LinkedList[T]) extends LinkedList[T]

// Define companion object with helper methods
object LinkedList {
  // Create an empty list
  def empty[T]: LinkedList[T] = EmptyList

  // Create a list with a single element
  def singleton[T](value: T): LinkedList[T] = ListNode(value, EmptyList)

  // Create a list from a sequence of elements
  def apply[T](values: T*): LinkedList[T] =
    values.foldRight(EmptyList: LinkedList[T])((value, acc) =>
      ListNode(value, acc)
    )
}
