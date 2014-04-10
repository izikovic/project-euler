package problems

import scala.annotation.tailrec

object Problem17 extends App {
	val mappings = Map[Int, Int](
		0 -> 0,
		1 -> 3,
		2 -> 3,
		3 -> 5,
		4 -> 4,
		5 -> 4,
		6 -> 3,
		7 -> 5,
		8 -> 5,
		9 -> 4,
		10 -> 3,
		11 -> 6,
		12 -> 6,
		13 -> 8,
		14 -> 8,
		15 -> 7,
		16 -> 7,
		17 -> 9,
		18 -> 8,
		19 -> 8,
		20 -> 6,
		30 -> 6,
		40 -> 5,
		50 -> 5,
		60 -> 5,
		70 -> 7,
		80 -> 6,
		90 -> 6,
		100 -> 10,
		1000 -> 11
	)

	def countWords(from: Int, to: Int): Int = {
		def parseDeka(n: Int): (Int, Int) = {
			if (n < 20) (n, 0)
			else ((n / 10) * 10, (n % 10))
		}

		def countWordsInner(n: Int, c: Int): Int = {
			if (n > to) c
			else if (n < 100) parseDeka(n) match {
				case (d, j) => countWordsInner(n + 1, c + mappings(d) + mappings(j))
			}
			else if (n >= 100 && n < 1000) {
				val ce = n / 100
				val dj = parseDeka((n % 100))

				countWordsInner(n + 1, c + mappings(ce) + (if (n % 100 == 0) (mappings(100) - 3) else mappings(100)) + mappings(dj._1) + mappings(dj._2))
			} else countWordsInner(n + 1, c + mappings(n))
		}

		countWordsInner(from, 0)
	}

	println(countWords(1, 1000))
}