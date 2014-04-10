package problems

object Problem10 extends App {
	def eratosthenes(n: Int): Array[BigInt] = {
		val numbers = Array.fill[Boolean](n + 1)(true)
		numbers(0) = false
		numbers(1) = false
		def eratosthenesInner(p: Int): Unit = {
			if (p * p > n) return
			else
				for (i <- p * p to n by p) numbers(i) = false
			eratosthenesInner(p + 1)
		}

		eratosthenesInner(2)
		(for (i <- numbers.indices if numbers(i)) yield BigInt(i)).toArray
	}

	println(eratosthenes(2000000).sum)
}