object Perceptron extends App {
  val w_1 = (0d, 0d)
  val x_1 = (-2d, 2d)
  val y_1 = 1d
  val x = List((-2d, 2d))

  val w_t = w_1
  val x_t = x_1

  val y_hat_t = sign(dot(w_1, x_1))
  val y_t = y_1
  val w_t1 = if (y_hat_t != y_t) add(w_t, mult(y_t, x_t)) else w_t

  println(w_t1)

  def sign(x: Double): Int = {
    if (x >= 0d) 1 else -1
  }

  def dot(x_1: (Double, Double), x_2: (Double, Double)): Double = {
    (x_1._1 * x_2._1) + (x_1._2 + x_2._2)
  }

  def mult(s: Double, x: (Double, Double)): (Double, Double) = {
    (s * x._1, s * x._2)
  }

  def add(v_1: (Double, Double), v_2: (Double, Double)): (Double, Double) = {
    (v_1._1 + v_2._1, v_1._2 + v_2._2)
  }

  def printArray(xs: List[(Double, Double)]): Unit = {
    xs.toStream.foreach(print)
  }
}