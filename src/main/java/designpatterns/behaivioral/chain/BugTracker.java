package designpatterns.behaivioral.chain;

public class BugTracker {

    public static void main(String[] args) {
        Notifier reportNotifier = new SimpleReportNotifier(Priority.ROUTINE);
        Notifier emailNotifier = new EmailNotifier(Priority.IMPORTANT);
        Notifier smsNotifier = new SMSNotifier(Priority.ASAP);

        reportNotifier.setNextNotifier(emailNotifier);
        reportNotifier.setNextNotifier(smsNotifier);

        reportNotifier.notifyManager("Everything  is OK.",Priority.ROUTINE);
        reportNotifier.notifyManager("Something is wrong.",Priority.IMPORTANT);
        reportNotifier.notifyManager("Huston we've had a problem !!!!!.",Priority.ASAP);


    }
}
