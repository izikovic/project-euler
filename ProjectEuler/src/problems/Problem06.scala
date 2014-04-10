package problems

object Problem6 extends App {
	def squareOfSum(number: Long): BigInt = {
		val sum: BigInt = (1L to number).iterator.sum
		sum * sum
	}

	def sumOfSquares(number: Long): BigInt = {
		(1L to number).iterator.map(x => x * x).sum
	}

	val sum = (1L to 100).iterator.sum
	println(sum * sum - (1L to 100).iterator.map(x => x * x).sum)
	
	println(squareOfSum(100) - sumOfSquares(100))
}