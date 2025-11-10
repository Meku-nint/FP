object My_module{// 

def abs(n:Int):Int={
    if (n<0) -n
    else n
}
def main(args:Array[String]):Unit={
    println("absolute value of -10 is :" +abs(-10))
}
}