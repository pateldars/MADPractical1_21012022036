fun main()
{
    println("Enter Number");
    var x = readLine()!!.toInt()
    println(
        when (x) {

            1->{"January"}
            2->{"February"}
            3->{"March"}
            4->{"April"}
            5->{"May"}
            6->{"June"}
            7->{"July"}
            8->{"August"}
            9->{"September"}
            10->{"Octomber"}
            11->{"November"}
            12->{"December"}
            else->{
                "enter the proper number"
            }
        }


    )

}