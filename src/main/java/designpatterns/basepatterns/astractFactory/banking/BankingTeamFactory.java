package designpatterns.basepatterns.astractFactory.banking;

import designpatterns.basepatterns.astractFactory.Developer;
import designpatterns.basepatterns.astractFactory.ProjectManger;
import designpatterns.basepatterns.astractFactory.ProjectTeamFactory;
import designpatterns.basepatterns.astractFactory.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDev();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManger getProjectManager() {
        return new BankingPM();
    }
}
