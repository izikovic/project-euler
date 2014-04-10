package problems

object Problem20 extends App {
	def fact(n: BigInt, ret: BigInt = 1): BigInt = {
		if (n == 1) ret
		else fact(n - 1, ret * n)
	}
	
	println(fact(100).toString.map(_.asDigit).sum)
}