package com.zemoso.christmaslight;

public class LightGrid implements LightLitInterface{
	
	private final int size = 1000;
    private final int[][] lightGridMatrix =new int[size][size];
    
    private final LightGridInterface turnOnLights = new TurnOnLights(); 
    private final LightGridInterface turnOffLights = new TurnOffLights(); 
    private final LightGridInterface toggleLights = new ToggleLights();
    private final LightGridOpsInterface lightsSwitchedOn = new LightGridOps();
    
	@Override
	public void turnOn(int xStart, int yStart, int xDestination, int yDestination) {
		// TODO Auto-generated method stub
		turnOnLights.toggle(1, lightGridMatrix, xStart, yStart, xDestination, yDestination);
	}
	@Override
	public void turnOff(int xStart, int yStart, int xDestination, int yDestination) {
		// TODO Auto-generated method stub
		turnOffLights.toggle(0, lightGridMatrix, xStart, yStart, xDestination, yDestination);
	}
	@Override
	public void toggle(int xStart, int yStart, int xDestination, int yDestination) {
		// TODO Auto-generated method stub
		toggleLights.toggle(-1, lightGridMatrix, xStart, yStart, xDestination, yDestination);
	}
	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println(lightsSwitchedOn.getNumberOfLightsSwitchedOn(size, lightGridMatrix));
	} 

}
