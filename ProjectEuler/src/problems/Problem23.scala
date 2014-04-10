package problems
import scala.util.control.Breaks._

/*
 * LOSE!!!!!!!
 */
object Problem23 extends App {
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

	def abundantNumbers(max: Int): Array[Int] = {
		def an(i: Int, l: Array[Int]): Array[Int] = {
			if (i > max) l
			else if (d(i) > i) an(i + 1, l :+ i)
			else an(i + 1, l)
		}

		an(1, Array())
	}

	val nums = abundantNumbers(28123)

	val canBeWrittenasAbundent = Array.fill[Boolean](28124)(false);
	for (i <- 0 until nums.length) {
		breakable {
			for (j <- i until nums.length) {
				if (nums(i) + nums(j) <= 28123) {
					canBeWrittenasAbundent(nums(i) + nums(j)) = true;
				} else {
					break
				}
			}
		}
	}

	var suma = 0
	for (i <- 0 until canBeWrittenasAbundent.length) {
		if (!canBeWrittenasAbundent(i)) suma += i
	}

	println(suma)
}