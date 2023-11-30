package com.example.kotlinbasics

fun main()
{
    var book1=Book()
    var customBook=Book(title="kotlin",author="me",yearPublished=2010)

    println("${book1.title} ${book1.author} ${book1.yearPublished}")
    println("${customBook.title} ${customBook.author} ${customBook.yearPublished}")
}