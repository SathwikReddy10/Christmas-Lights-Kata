package com.zemoso.christmaslight;

public class BrightGrid implements LightLitInterface,LightLitShowInterface {
	
	private final int size = 1000;
    private final int[][] lightGridMatrix =new int[size][size];
    
    private final LightGridInterface brightLightsOn = new BrightTurnOnLights();
    private final LightGridInterface brightLightsOff = new BrightTurnOffLights();
    private final LightGridInterface brightLightsToggle = new BrightToggleLights();
    private final BrightGridOpsInterface brightGridOps = new BrightGridOps();

	@Override
	public void turnOn(int xStart, int yStart, int xDestination, int yDestination) {
		// TODO Auto-generated method stub
		brightLightsOn.toggle(1, lightGridMatrix,xStart,yStart,xDestination,yDestination);
	}

	@Override
	public void turnOff(int xStart, int yStart, int xDestination, int yDestination) {
		// TODO Auto-generated method stub
		brightLightsOff.toggle(0, lightGridMatrix,xStart,yStart,xDestination,yDestination);
	}

	@Override
	public void toggle(int xStart, int yStart, int xDestination, int yDestination) {
		// TODO Auto-generated method stub
		brightLightsToggle.toggle(-1, lightGridMatrix,xStart,yStart,xDestination,yDestination);
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println(brightGridOps.getBrightnessOfLightGrid(size,lightGridMatrix));
	}

}
