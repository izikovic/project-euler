package problems

object Problem1 extends App {
	def calculate(number: Int): Int = {
		var sum = 0
		for (
			i <- 3 to number if (i % 3) == 0 || (i % 5) == 0
		) {
			sum += i
		}
		sum
	}

	def recursive(number: Int): Int = {
		def recursiveInner(number: Int, sum: Int): Int = {
			if (number == 3) sum + 3
			else if (number % 3 == 0 || number % 5 == 0) recursiveInner(number - 1, sum + number)
			else recursiveInner(number - 1, sum)
		}
		recursiveInner(number, 0)
	}

	println(recursive(999))
	println(calculate(999))
}