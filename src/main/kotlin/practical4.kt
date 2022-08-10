fun main()
{
    println("Enter Number:")
    var d = readLine()!!.toInt()

    println(if(d%2==0)
        println("$d is even")
    else
        println("$d is odd"))


}