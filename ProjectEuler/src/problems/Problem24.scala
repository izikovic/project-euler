package problems

object Problem24 extends App {
	def lexicalPermutations(max: Int, n: Int, a: Array[Int]): Array[Int] = {
		if (n == max) a
		else {
			var first = a.length - 1
			for (i <- 0 until a.length - 1) {
				if (a(i) < a(i + 1)) first = i
			}
			
			var second = a.indexOf(a.max)
			for (i <- first until a.length) {
				if (a(i) > a(first) && a(i) <= a(second)) second = i
			}
			
			val temp = a(second)
			a(second) = a(first)
			a(first) = temp
			
			java.util.Arrays.sort(a, first + 1, a.length)
			
			lexicalPermutations(max, n + 1, a)
		}
	}
	
	lexicalPermutations(1000000, 1, (0 to 9).toArray).foreach(x => print(x))

}