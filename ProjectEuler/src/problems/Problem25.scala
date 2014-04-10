package problems

object Problem25 extends App {
	val fib: Stream[BigInt] = {
		def tail(h: BigInt, n: BigInt): Stream[BigInt] = h #:: tail(n, h + n)
		tail(0, 1)
	}

	var i = 1
	while(fib(i).toString.length <1000) i += 1
	
	println(i)
}