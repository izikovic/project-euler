package problems

object Problem7 extends App {
	def nthPrime(n: BigInt): BigInt = {
		def nthPrimeInner(number: BigInt, f: List[BigInt]): BigInt = {
			if (f.size == n) f.head
			else
				f.exists(x => number % x == 0) match {
					case true => nthPrimeInner(number + 2, f)
					case _ => nthPrimeInner(number + 2, number :: f)
				}
		}

		nthPrimeInner(3, 2 :: Nil)
	}

	println(nthPrime(10001))
}