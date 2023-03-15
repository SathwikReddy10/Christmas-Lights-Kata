package com.zemoso.christmaslight;

public class ManagerBrightImpl implements ManagerBrightInterface{

	LightLitInterface brightnessLightGrid = new BrightGrid();
	LightLitShowInterface brightLightShow = new BrightGrid();
	
	@Override
	public void brightnessofLights() {
		// TODO Auto-generated method stub
		brightnessLightGrid.turnOn(887,9,959,629);
        brightnessLightGrid.turnOn(454,398,844,448);
        brightnessLightGrid.turnOff(539,243,559,965);
        brightnessLightGrid.turnOff(370,819,676,868);
        brightnessLightGrid.turnOff(145,40,370,997);
        brightnessLightGrid.turnOff(301,3,808,453);
        brightnessLightGrid.turnOn(351,678,951,908);
        brightnessLightGrid.toggle(720,196,897,994);
        brightnessLightGrid.toggle(831,394,904,860);
        brightLightShow.show();
	}

}
