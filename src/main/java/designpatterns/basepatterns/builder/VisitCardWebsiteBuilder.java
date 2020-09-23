package designpatterns.basepatterns.builder;

public class VisitCardWebsiteBuilder extends WebSiteBuilder{


    @Override
    void buildName() {
        webSite.setName("Visit card");
    }

    @Override
    void buildCms() {
        webSite.setCms(CMs.WORLDPRESS);
    }

    @Override
    void buildPrice() {
        webSite.setPrice(500);
    }
}
