package designpatterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class DeveloperFactory {

    private static final Map<String ,Developer> developers = new HashMap<>();

    public Developer getDeveloperBySpeciality(String speciality){
        Developer developer = developers.get(speciality);
        if(developer == null){
            switch (speciality){
                case "java":
                    System.out.println("Hiring java dev");
                    developer =  new JavaDev();
                    break;
                case "cpp":
                    System.out.println("Hiring cpp dev");
                    developer = new CppDev();
            }
            developers.put(speciality,developer);
        }
        return developer;
    }
}
