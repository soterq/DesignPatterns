package designpatterns.basepatterns.astractFactory;

import designpatterns.basepatterns.astractFactory.banking.BankingTeamFactory;

public class SuperBankSystem {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new BankingTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester= projectTeamFactory.getTester();
        ProjectManger  manger = projectTeamFactory.getProjectManager();

        System.out.println("Create bank system ...");
        developer.writeCode();
        tester.testCode();
        manger.manageProject();
    }
}
