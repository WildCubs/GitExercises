package com.company;

import java.util.Scanner;

public class Main {
Scanner keybdINput = new Scanner(System.in);

    public void greet() {
        System.out.println("Hello. What is your name?");
        String inputName = keybdINput.next();
        System.out.println("Good morning, " + inputName);
    }


    public static void main(String[] args) {
        System.out.println("Workflow works!");
        Main getMe = new Main();
        getMe.greet();
    }
}
