package designpatterns.basepatterns.prototype;

public class VersionControlRunner {

    public static void main(String[] args) {
        Project master = new Project(1,"Master","Source code = new SourceCode();");

    ;
        ProjectFactory factory = new ProjectFactory(master);
        Project masterCone = factory.cloneProject();
        master.setName("Is working");
        System.out.println(master);
        System.out.println(masterCone);
    }
}
