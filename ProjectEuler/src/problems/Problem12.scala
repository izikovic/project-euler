package problems

object Problem12 extends App {
	def factorize(number: Long): Map[Long, Int] = {
		def factorizeInner(n: Long, m: Long, e: Int, f: Map[Long, Int]): Map[Long, Int] = {
			if (m > n) f + (m -> e)
			else if (n % m == 0) factorizeInner(n / m, m, e + 1, f)
			else if (e != 0) factorizeInner(n, m + 1, 0, f + (m -> e))
			else factorizeInner(n, m + 1, 0, f)
		}

		factorizeInner(number, 2, 0, Map[Long, Int]())
	}

	def numberOfDivisors(number: Long): Long = {
		factorize(number).values.map(_ + 1).product
	}

	def overXDivisors(x: Long, number: Long = 1, i: Long = 2): Long = {
		if (numberOfDivisors(number) > x) number
		else overXDivisors(x, number + i, i + 1)
	}
	val start = System.nanoTime()
	println(overXDivisors(500))
	val end = System.nanoTime()
	println("Elapsed: " + ((end - start) / 1000. / 1000. / 1000.) + " s")
}