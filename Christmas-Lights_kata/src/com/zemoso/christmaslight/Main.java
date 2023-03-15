package com.zemoso.christmaslight;

public class Main {
    public static void main(String[] args) {
       ManagerInterface manager = new ManagerImpl();
       manager.lightsLit();
       manager.brightnessofLights();
    }
}