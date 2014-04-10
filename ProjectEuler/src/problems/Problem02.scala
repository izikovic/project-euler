package problems

object Problem2 extends App {
	def recursiveFibonacci(lessThan: Long): List[Long] = {
		def fibonacciInner(first: Long, second: Long, lessThan: Long): List[Long] = {
			if (first > lessThan) Nil
			else first :: fibonacciInner(second, first + second, lessThan)
		}
		fibonacciInner(1, 2, lessThan)
	}
	
	recursiveFibonacci(4000000).foreach(println)
	
	println(recursiveFibonacci(4000000).filter(x => (x % 2) == 0).sum)
}