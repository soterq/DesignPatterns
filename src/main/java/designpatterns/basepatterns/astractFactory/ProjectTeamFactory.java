package designpatterns.basepatterns.astractFactory;

public interface ProjectTeamFactory {
    Developer getDeveloper();
    Tester getTester();
    ProjectManger getProjectManager();

}
