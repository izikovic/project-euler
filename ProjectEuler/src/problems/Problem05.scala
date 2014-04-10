package problems

object Problem5 extends App {
	def isEvenlyDivisible(number: BigInt, mod: BigInt): Boolean = {
		if (mod == 10) true
		else if (number % mod == 0) isEvenlyDivisible(number, mod - 1)
		else false
	}

	val max: BigInt = 20L * 19L * 18L * 17L * 16L * 15L * 14L * 13L * 12L * 11L

	val broj: BigInt = 2L * 2l * 3L * 3l * 4l * 5L * 7L * 11L * 13L * 17L * 19L

	println(broj)
	
	println(isEvenlyDivisible(broj, 20))
}