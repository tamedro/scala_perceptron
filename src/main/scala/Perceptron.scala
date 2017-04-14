object Perceptron extends App {
  printArray()

  def printArray(): Unit = {
    val l = List(1, 2, 3, 4)
    l.toStream.foreach(print)
  }

}