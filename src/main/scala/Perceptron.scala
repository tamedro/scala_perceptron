object Perceptron extends App {
  val w_0 = (0d, 0d)
  val x_0 = (-2d, 2d)
  val x = List((-2d, 2d))

  println(sign(dot(w_0, x_0)))

  def sign(x: Double): Int = {
    if (x >= 0d) 1 else -1
  }

  def dot(x_1: (Double, Double), x_2: (Double, Double)): Double = {
    (x_1._1 * x_2._1) + (x_1._2 + x_2._2)
  }

  def printArray(xs: List[(Double, Double)]): Unit = {
    xs.toStream.foreach(print)
  }
}