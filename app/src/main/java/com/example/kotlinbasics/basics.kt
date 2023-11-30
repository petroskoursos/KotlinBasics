package com.example.kotlinbasics

fun main()
{
    println("give the first number you want to add")
    var num1= readln().toInt()
    println("give the second number you want to add")
    var num2= readln().toInt()
    var myresult= add(num1,num2)

    println("the result of $num1 + $num2 = $myresult")



}
fun add(num1:Int, num2:Int):Int{
    var result=num1+num2
    return result


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
