package main.controller;

import java.util.Scanner;

public class KeyboardReader implements Reader{

    @Override
    public String read() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
        
    }
}
