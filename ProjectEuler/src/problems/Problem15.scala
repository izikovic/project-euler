package problems

object Problem15 extends App {
	def latticePaths(n: Int): Long = {
		val m = Array.fill[Array[Long]](n + 1)(Array.fill[Long](n + 1)(1))
		for (i <- 1 to n; j <- 1 to n) m(i)(j) = m(i - 1)(j) + m(i)(j - 1)
		m(n)(n)
	}

	println(latticePaths(20))
}