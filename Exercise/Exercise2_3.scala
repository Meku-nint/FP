// Currying: converts a function of two arguments into a function of one argument that returns another function
object CurryingExample extends App { 

def curry[A, B, C](f: (A, B) => C): A => (B => C) = {
  (a: A) => (b: B) => f(a, b)
}

val multiply = (x: Int, y: Int) => x * y
val cmult = curry(multiply)
val double = cmult(2)  
println(double(5))               
println(cmult(3)(4))    
}