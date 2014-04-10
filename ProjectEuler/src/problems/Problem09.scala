package problems

object Problem9 extends App {
	def specialPythagoreanTriplet(): (Int, Int, Int) = {
		for (
			a <- 1 to 1000;
			b <- (a + 1) to 1000
		) {
			val c = math.sqrt(a * a + b * b)
			if (a + b + c == 1000) return (a, b, c.toInt)
		}
		(0, 0, 0)
	}
	
	println(specialPythagoreanTriplet._1 * specialPythagoreanTriplet._2 * specialPythagoreanTriplet._3)
}