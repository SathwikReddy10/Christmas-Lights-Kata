package com.zemoso.christmaslight;

public class ManagerImpl implements ManagerInterface {
	
	LightLitInterface litLights = new LightGrid();
	LightLitInterface brightnessLightGrid = new BrightGrid();

	@Override
	public void lightsLit() {
		// TODO Auto-generated method stub
		litLights.turnOn(887,9,959,629);
        litLights.turnOn(454,398,844,448);
        litLights.turnOff(539,243,559,965);
        litLights.turnOff(370,819,676,868);
        litLights.turnOff(145,40,370,997);
        litLights.turnOff(301,3,808,453);
        litLights.turnOn(351,678,951,908);
        litLights.toggle(720,196,897,994);
        litLights.toggle(831,394,904,860);
        litLights.show();
	}

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
        brightnessLightGrid.show();
	}

}
