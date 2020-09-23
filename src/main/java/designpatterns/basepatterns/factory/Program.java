package designpatterns.basepatterns.factory;

public class Program {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = createDeveloperByLanguage("cpp");
        Developer developer = developerFactory.createDeveloper();
        developer.writeCode();
        DeveloperFactory developerFactory2 = createDeveloperByLanguage("java");
        Developer developer2 = developerFactory2.createDeveloper();
        developer2.writeCode();
    }


    static DeveloperFactory createDeveloperByLanguage(String language){
        switch (language){
            case "java":
                return new JavaDeveloperFactory();
            case "cpp":
                return new CppDeveloperFactory();
            default:
                throw new IllegalArgumentException(language + " is not used in our company");

        }
    }
}
