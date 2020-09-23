package designpatterns.basepatterns.astractFactory.website;

import designpatterns.basepatterns.astractFactory.Developer;
import designpatterns.basepatterns.astractFactory.ProjectManger;
import designpatterns.basepatterns.astractFactory.ProjectTeamFactory;
import designpatterns.basepatterns.astractFactory.Tester;

public class WebSiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDev();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManger getProjectManager() {
        return new WebSitePM();
    }
}
