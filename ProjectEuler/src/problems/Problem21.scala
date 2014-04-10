package problems

object Problem21 extends App {

	def d(n: Int): Int = {
		def properDivisors(number: Int): List[Int] = {
			def pd(i: Int, ret: List[Int]): List[Int] = {
				if (i < 1) ret
				else if (number % i == 0) pd(i - 1, i :: ret)
				else pd(i - 1, ret)
			}

			if (number == 1) 1 :: Nil
			else pd(math.floor(number / 2).toInt, Nil)
		}

		properDivisors(n).sum
	}

	val divisorMap = (1 until 10000).map(x => (x -> d(x))).toMap
	val amicables = divisorMap.filter(x => x match { case (x, y) => x == d(y) && x != y })
	
	println(amicables.keys.sum)
}