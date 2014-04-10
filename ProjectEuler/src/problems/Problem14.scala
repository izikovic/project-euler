package problems

object Problem14 extends App {
	def collatzSequence(n: Long, i: Long = 1): Long = {
		if (n == 1) i
		else if (n % 2 == 0) collatzSequence(n / 2, i + 1)
		else collatzSequence(3 * n + 1, i + 1)
	}

	def maxChain(start: Long, end: Long): (Long, Long) = {
		def maxChainInner(n: Long, chain: Long, res: Long): (Long, Long) = {
			if (n == end) (res, chain)
			else {
				val cn = collatzSequence(n)
				if (cn > chain) maxChainInner(n + 1, cn, n)
				else maxChainInner(n + 1, chain, res)
			}
		}
		maxChainInner(start, 0, start)
	}

	println(maxChain(1, 1000000))

	val start = System.nanoTime()
	val res = maxChain(1, 1000000)
	val end = System.nanoTime()
	println("Elapsed: " + ((end - start) / 1000. / 1000. / 1000.) + " s")
	println(res)
}