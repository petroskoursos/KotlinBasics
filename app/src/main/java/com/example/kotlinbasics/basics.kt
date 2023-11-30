package com.example.kotlinbasics

fun main()
{

    //creating an object of the class dog
    var jack=Dog(name = "jack", bread = "doggo")

    println("${jack.name} is a  ${jack.bread}")
}


fun makeCoffee(sugarcount:Int,name:String)
{
    if(sugarcount==1)
        println("$name wants coffe with $sugarcount spoon of sugar ")
    else if(sugarcount==0)
        println("$name wants coffe with no sugar")
    else
        println("$name wants coffe with $sugarcount spoons of sugar")

}
fun askUser()
{
    println("who wants some coffee?")
    var name= readln()
    println("how much sugar do you want $name?")
    var sugarCount= readln().toInt()
    makeCoffee(sugarCount,name)
}
