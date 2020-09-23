package designpatterns.structural.decorate;

public class Task {
    public static void main(String[] args) {
        Developer developer = new JavaTeamLead(new SeniorJavaDev(new JavDev()));

        System.out.println(developer.writeCode());
    }
}
