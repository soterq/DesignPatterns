package designpatterns.basepatterns.builder;

public class EnterpriseWebSiteBuilder extends WebSiteBuilder {
    @Override
    void buildName() {
        webSite.setName("Enterprise web site");
    }

    @Override
    void buildCms() {
        webSite.setCms(CMs.ALIFRESCO);
    }

    @Override
    void buildPrice() {
        webSite.setPrice(10000);
    }
}
