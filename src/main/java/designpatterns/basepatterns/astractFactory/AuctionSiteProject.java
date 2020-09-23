package designpatterns.basepatterns.astractFactory;

import designpatterns.basepatterns.astractFactory.website.WebSiteTeamFactory;

public class AuctionSiteProject {
    public static void main(String[] args) {
        ProjectTeamFactory teamFactory = new WebSiteTeamFactory();
        Developer developer = teamFactory.getDeveloper();
        Tester tester = teamFactory.getTester();
        ProjectManger manger = teamFactory.getProjectManager();

        System.out.println("Creating Auction site project");
        developer.writeCode();
        tester.testCode();
        manger.manageProject();
    }
}
