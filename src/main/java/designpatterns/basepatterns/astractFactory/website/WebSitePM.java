package designpatterns.basepatterns.astractFactory.website;

import designpatterns.basepatterns.astractFactory.ProjectManger;

public class WebSitePM implements ProjectManger {
    @Override
    public void manageProject() {
        System.out.println("Web site PM manage web site project");
    }
}
