package com.designpatterns.exercise5;

public class DecoratorTest {
    public static void main(String[] args) {

        // Email only
        Notifier emailNotifier = new EmailNotifier();
        System.out.println("-- Email Only --");
        emailNotifier.send("Server is down!");

        System.out.println("----------------------");

        // Email + SMS
        Notifier emailSMS = new SMSNotifierDecorator(new EmailNotifier());
        System.out.println("-- Email + SMS --");
        emailSMS.send("Disk usage at 90%!");

        System.out.println("----------------------");

        // Email + SMS + Slack
        Notifier allChannels = new SlackNotifierDecorator(new SMSNotifierDecorator(new EmailNotifier()));
        System.out.println("-- Email + SMS + Slack --");
        allChannels.send("Critical error in production!");
    }
}
