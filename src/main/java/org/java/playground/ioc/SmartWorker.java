package org.java.playground.ioc;

public class SmartWorker {

    private Tool tool;

    public SmartWorker(Tool tool) {
        this.tool = tool;
    }

    public void work() {
        tool.doYourJob();
    }
}




