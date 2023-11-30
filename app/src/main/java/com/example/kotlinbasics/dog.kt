package com.example.kotlinbasics

class Dog(val name:String,val bread:String) {

    init {
        bark(name)
        run(name)
    }
    fun bark(name: String)
    {
        println("$name says woof woof")
    }
    fun run(name: String)
    {
        println("$name is running")
    }
}