object Perceptron extends App {
  val x = List((-2d, 2d), (-2d, -3d), (2d, -1d), (1d, -4d), (2d, 2d), (-3d, -1d))
  val y = List(1d, -1d, 1d, -1d, 1d, -1d)

  var w_t1 = (0d, 0d)
  var i = 0
  for (i <- 0 to 5) {
    val w_t = w_t1
    val x_t = x(i)
    val y_t = y(i)
    val y_hat_t = sign(dot(w_t, x_t))

    w_t1 = if (y_hat_t != y_t) add(w_t, mult(y_t, x_t)) else w_t
  }

  println(w_t1)

  def sign(x: Double): Int = {
    if (x < 0d) -1 else if (x == 0) 0 else 1
  }

  def dot(x_1: (Double, Double), x_2: (Double, Double)): Double = {
    (x_1._1 * x_2._1) + (x_1._2 * x_2._2)
  }

  def mult(s: Double, x: (Double, Double)): (Double, Double) = {
    (s * x._1, s * x._2)
  }

  def add(v_1: (Double, Double), v_2: (Double, Double)): (Double, Double) = {
    (v_1._1 + v_2._1, v_1._2 + v_2._2)
  }

}