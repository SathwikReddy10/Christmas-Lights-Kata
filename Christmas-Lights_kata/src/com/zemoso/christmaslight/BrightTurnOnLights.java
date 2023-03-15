package com.zemoso.christmaslight;

public class BrightTurnOnLights implements LightGridInterface{

	@Override
	public void toggle(int turnStatus, int[][] lightGridMatrix, int xStart, int yStart, int xDestination,
			int yDestination) {
		// TODO Auto-generated method stub
		for (int i = xStart; i <= xDestination; i++) {
            for (int j = yStart; j <= yDestination; j++) {
                lightGridMatrix[i][j] += 1;
            }
        }
	}

}
