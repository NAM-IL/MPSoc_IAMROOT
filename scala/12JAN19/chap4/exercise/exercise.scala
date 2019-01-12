
/**
 * #1.
 * @param r radius
 */
def areaCircle(r: Double): Double = {
	val PI = 3.141592
	PI * r * r
}
println(areaCircle(r = 3))

/**
 * #2
 * @param r radius
 */
def areaCircleString(r: String = "0"): Double = {
	val PI = 3.141592
	PI * r.toDouble * r.toDouble
}
println(areaCircleString(r = "3"))
println(areaCircleString())
println(areaCircleString(r = ""))
