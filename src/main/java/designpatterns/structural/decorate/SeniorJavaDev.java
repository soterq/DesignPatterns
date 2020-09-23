package designpatterns.structural.decorate;

public class SeniorJavaDev extends DeveloperDecorator{
    public SeniorJavaDev(Developer developer) {
        super(developer);
    }
    public String makeCodeReview(){
        return "Make code review ...";
    }

    @Override
    public String writeCode() {
        return super.writeCode() + makeCodeReview();
    }
}
