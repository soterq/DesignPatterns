package designpatterns.basepatterns.astractFactory.website;

import designpatterns.basepatterns.astractFactory.Developer;

public class PhpDev implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Php dev write php code ...");
    }
}
