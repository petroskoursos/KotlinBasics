package com.example.kotlinbasics

fun main()
{
    var age=0;

    println("enter your age");
    age= readln().toInt();
    if(age in 18..39)
        println("you can enter the club");
    else if( age>=40)
        println("you cant enter the club please go home");
    else if(age<=15)
        println("go home and drink some milk kid wtf are you doing here")
}