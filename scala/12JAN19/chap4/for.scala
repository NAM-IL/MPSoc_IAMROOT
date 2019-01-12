println("Basic iteration")
for (x <- 1 to 7)
{
	println(s"Day $x:")
}

println("Yield test")
val test = for (x <- 1 to 7) yield { s"Day $x:" }
println(test)

println("For each test")
for (day <- test) print(day + ", ")

println("Iterator guard test")
val threes = for (i <- 1 to 20 if i % 3 == 0) yield i
println(threes)


