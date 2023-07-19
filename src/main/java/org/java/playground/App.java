package org.java.playground;

import org.java.playground.ioc.Hammer;
import org.java.playground.ioc.Screwdriver;
import org.java.playground.ioc.SmartWorker;
import org.java.playground.ioc.Worker;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Worker worker = new Worker();
        SmartWorker smartWorker = new SmartWorker(new Screwdriver());
        SmartWorker anotherSmartWorker = new SmartWorker(new Hammer());
    }
}
