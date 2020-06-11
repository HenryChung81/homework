package com.train;


import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {
        int tickets = 0;
        while (tickets != -1) {

            System.out.println("Please enter number of tickets: ");
            Scanner scanner = new Scanner(System.in);
            tickets = scanner.nextInt();
            if (tickets == -1) break;
            System.out.println("How many round-trip tickets: ");
            int roundTrip = scanner.nextInt();
            Ticket t = new Ticket(tickets, roundTrip);
            t.printInfo();
        }
    }
}
