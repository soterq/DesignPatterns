package designpatterns.basepatterns.astractFactory.banking;

import designpatterns.basepatterns.astractFactory.Developer;

public class JavaDev implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java dev write java code");
    }
}
