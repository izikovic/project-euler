package problems

object Problem4 extends App {
	def isPalindrome(number: Long): Boolean = {
		val s = number.toString
		val l = s.length()
		if (l < 2 || l % 2 != 0) false
		else {			
			for (i <- 0 until (l / 2)) {
				if (s(i) != s(l - 1 - i)) return false
			}
			true
		}
	}
	
	def hasThreeDigitFactors(number: Long): Boolean = {
		for (i <- 100 to 999 if number % i == 0 && (number / i).toString.length() == 3) {
			if (i.toString.length() == 3) {
				//println(i + " * " + (number / i))
				return true
			}
		}
		false
	}
	
	println((10000L to 998001L).iterator.filter(hasThreeDigitFactors).filter(isPalindrome).max)
}