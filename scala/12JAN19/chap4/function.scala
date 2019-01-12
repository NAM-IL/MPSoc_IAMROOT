
/* Parameter that has a default value */
def greet(prefix: String = "", name: String) = s"$prefix$name"
val greeting1 = greet(name = "Paul")
println("Default valued parameter test")
println(greeting1)


/* Variable arguments (varargs) */
def sum(items: Int*): Int = {
	var total = 0
	for (i <- items) total += i
	total
}
println("varargs test")
println(sum(10,20,30))

/* Parameter group */
def max(x: Int)(y: Int) = if (x > 6) x else y
val larger = max(20)(39)
println("Parameter group test")
println(larger)


/* Type parameter */
def identity[A](a: A): A = a

val s: String = identity[String]("Hello!")
val d: Double = identity[Double](2.717)
val e: String = identity("Hello!")
val f: Double = identity(2.717)

println("Type parameter test")
println(s, d, e, f)


/* Method invocation */
def mInvocation() = {
	val s = "vacation.jpg"
	val isJPEG = s.endsWith(".jpg")
	println("Method invocation test")
	println(isJPEG)
}
mInvocation()
