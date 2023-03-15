package com.zemoso.christmaslight;

public class Main {
    public static void main(String[] args) {
       ManagerInterface manager = new ManagerImpl();
       ManagerBrightInterface managerBright = new ManagerBrightImpl();
       manager.lightsLit();
       managerBright.brightnessofLights();
    }
}