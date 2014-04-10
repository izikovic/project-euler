package problems

import java.util.Calendar

object Problem19 extends App {
	val start = Calendar.getInstance()
	start.set(Calendar.DAY_OF_MONTH, 1)
	start.set(Calendar.MONTH, Calendar.JANUARY)
	start.set(Calendar.YEAR, 1901)
	
	val end = Calendar.getInstance()
	end.set(Calendar.DAY_OF_MONTH, 31)
	end.set(Calendar.MONTH, Calendar.DECEMBER)
	end.set(Calendar.YEAR, 2000)
	
	var counter = 0
	
	while (start.compareTo(end) < 0) {
		if (start.get(Calendar.DAY_OF_MONTH) == 1 && start.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) counter += 1
		start.add(Calendar.DATE, 1)
		//println("tu")
	}
	
	println(counter)
}