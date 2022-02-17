package com.company;

public class Main {

    public static void main(String[] args) {
        int ticketPrice = 2_000;
        int milePrice = 20;

        int bonusMiles = (ticketPrice / milePrice);
        System.out.println(bonusMiles);
    }
}
