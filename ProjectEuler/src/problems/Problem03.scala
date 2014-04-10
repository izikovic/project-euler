package problems

object Problem3 extends App {
	def primeFactors(number: Long): Array[Long] = {

		var i = 2
		while (number % i != 0) {
			i += 1
		}
		if (i == number) Array(i)
		else Array.concat(primeFactors(i), primeFactors(number / i))

	}

	println(primeFactors(600851475143L).max)
	
}