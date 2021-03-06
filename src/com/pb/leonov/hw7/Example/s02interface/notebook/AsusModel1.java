package com.pb.leonov.hw7.Example.s02interface.notebook;


public class AsusModel1 extends Asus implements Tablet {

    @Override
    public void connectToWiFi() {
        System.out.println("Asus Model 1 connected to WiFi");
    }

    @Override
    public void doWork() {
        if (batteryLevel <= 20) {
            System.out.println("Low battery level, need charging.");
            return;
        }

        System.out.println("Asus Model 1 working...");
        batteryLevel -= 20;
        System.out.println("Asus Model 1 work done.");
    }

    @Override
    public void navigateByScreen() {
        if (batteryLevel <= 5) {
            System.out.println("Low battery level, need charging.");
            return;
        }

        System.out.println("Navigation by screen Asus Model 1");
        batteryLevel -= 5;
    }
}
