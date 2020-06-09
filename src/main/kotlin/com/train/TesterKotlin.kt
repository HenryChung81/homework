package com.train

import java.util.*

fun main(args: Array<String>) {
    println("Please enter number of tickets: ")
    val scanner = Scanner(System.`in`)
    val tickets = scanner.nextInt()
    println("How many round-trip tickets: ")
    val roundTrip = scanner.nextInt()
    val t = Ticket1(tickets, roundTrip)
    t.printInfo()
}

class Ticket1(var tickets: Int, var roundTrip: Int) {

    fun printInfo() {
        println("Total tickets:$tickets")
        println("Round-trip:$roundTrip")
        println("Total:" + ((tickets - roundTrip) * 1000 + ((roundTrip * 2000) * 0.9)))
    }
}