package designpatterns.basepatterns.astractFactory.website;

import designpatterns.basepatterns.astractFactory.Tester;

public class ManualTester implements Tester {
    @Override
    public void testCode() {
        System.out.println("Manual tester test web site ...");
    }
}
