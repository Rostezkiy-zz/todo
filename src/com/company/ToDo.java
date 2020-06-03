package com.company;

import java.util.Scanner;

public class ToDo {
    public static void main(String[] args) {
        Tasks myTasks = new Tasks("default");

        System.out.println("Type 'help' for available commands. \n\n Enter command: ");
        Scanner userInput = new Scanner(System.in);
        String command = userInput.nextLine();
        if (command.equalsIgnoreCase("help")) {
            Help.run();
        } else {
            String inputSplit = command;
            String[] parts = inputSplit.split(" ", 2);
            System.out.println(String.format("Command: %s; Description: %s", parts[0], parts[1]));
            switch (command) {
                case ("add"):
                    myTasks.addTask();
                    System.out.println("added");
                    break;
                case ("show"):
                    System.out.println("Tasks: \n");
                default:
                    System.out.println("Error occurred. Type 'help' for available commands");
            }
        }


    }
}
