// this exercise is to demonstrate how to use higher-order functions and polymorphism in Scala works.
// extends App to allow running without a main method
object Exercise2_2 extends App {
    def isSorted[A](as:Array[A],ordered:(A,A)=>Boolean):Boolean={
        @annotation.tailrec
        def loop(n:Int):Boolean ={
            if(n>=as.length-1) true  // base case of the program
            else if(!ordered(as(n),as(n+1))) false // if the order is not correct, return false
            else loop(n+1)
        }
        loop(0)
    }
    val arr=Array(1,2,3,4,5,6) 
    val arr2=Array(1,3,2,4,5,6)
    println(isSorted(arr,(a:Int,b:Int)=>a<=b))   // print true
    println(isSorted(arr2,(a:Int,b:Int)=>a<=b)) // print false 
}