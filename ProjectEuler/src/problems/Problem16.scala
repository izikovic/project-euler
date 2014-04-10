package problems

object Problem16 extends App {
	println(BigInt(2).pow(1000).toString.map(x => BigInt(x) - 48).sum)
}