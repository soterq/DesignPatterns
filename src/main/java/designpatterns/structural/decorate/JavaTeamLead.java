package designpatterns.structural.decorate;

public class JavaTeamLead extends DeveloperDecorator{
    public JavaTeamLead(Developer developer) {
        super(developer);
    }

    public String sendWeekReport(){
        return "Send report to customer";
    }

    @Override
    public String writeCode() {
        return super.writeCode() +sendWeekReport();
    }
}
