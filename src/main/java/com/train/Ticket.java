package com.train;

public class Ticket {

    int tickets;
    int roundTrip;

    public Ticket(int tickets, int roundTrip) {
        this.tickets = tickets;
        this.roundTrip = roundTrip;
    }

    public void printInfo() {

        System.out.println("Total tickets:" + tickets);
        System.out.println("Round-trip:" + roundTrip);
        System.out.println("Total:" + ((tickets - roundTrip) * 1000 + ((roundTrip) * 2000) * 0.9));

    }
}

