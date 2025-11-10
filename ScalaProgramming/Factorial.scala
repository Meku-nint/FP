object Factorial {
    def factorial(n: Int): Int = {
        def go(n: Int, acc: Int): Int = {
            if (n <= 0) acc
            else go(n - 1, n * acc)
        }
        go(n, 1)
    }

    def main(args: Array[String]): Unit = {
        println(factorial(5)) // 120
    }
}

// this program ins functional programming style to calculate factorial of a number using tail recursion.
// because the program is immutable (there are no change in variable and state),and it is pure function (there is no side effect and output depends only on input), it is considered as functional programming.