package com.company;

import java.util.ArrayList;

public class Tasks {

    String name;
    ArrayList<String> myTasks = new ArrayList<String>();


    public Tasks(String name, ArrayList<String> myTasks) {
        this.name = name;
        this.myTasks = myTasks;
    }

    public Tasks(String aDefault) {
    }

    public ArrayList<String> getMyTasks() {
        return myTasks;
    }

    public void setMyTasks(ArrayList<String> myTasks) {
        this.myTasks = myTasks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void addTask() {
        myTasks.add();
    }
}
