package org.java.playground.ioc;

public class Worker {

    private Tool tool;

    public Worker() {
        tool = new Screwdriver();
    }

    public void work() {
        tool.doYourJob();
    }
}





