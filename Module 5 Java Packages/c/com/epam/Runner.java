package com.epam;

public class Runner {

    public static void main(String[] args) {
        com.epam.like.Liker likerA = new com.epam.like.Liker();
        com.epam.rlike.Liker likerB = new com.epam.rlike.Liker();

        likerA.like();
        likerB.like();
    }
}
