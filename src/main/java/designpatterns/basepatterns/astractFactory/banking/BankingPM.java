package designpatterns.basepatterns.astractFactory.banking;

import designpatterns.basepatterns.astractFactory.ProjectManger;

public class BankingPM implements ProjectManger {
    @Override
    public void manageProject() {
        System.out.println("Banking PM manages banking project ...");
    }
}
