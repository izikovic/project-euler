package problems

import io.Source._
object Problem22 extends App {
	val start = System.nanoTime()
	
	val names = fromFile("names.txt").getLines.mkString.split(",").map(_.replace("\"", "")).sorted
	val scores = names.map(s => s.map(_.toInt - 64).sum)

	println((for (i <- 0 until names.length) yield scores(i) * (i + 1)).sum)
	println("Elapsed: " + ((System.nanoTime() - start) / 1000. / 1000. / 1000.) + " s")
}